package datastructuresproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doublylinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
		
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublylinkedlist frame = new Doublylinkedlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Doublylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(58, 10, 313, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 58, 161, 17);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(186, 55, 64, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear
				Node temp;
				int elem;
				elem =Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				
				if(first==null) {
					first = newnode;
					String message ="Inserted element is"+newnode.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					
					
				}
				else
				{
					temp = first;
					while(temp.nextlink!= null) {
						temp = temp.nextlink;
					}
					temp.nextlink =newnode;
					newnode.prelink=temp;
					String message ="Inserted element is"+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insertrear.setForeground(new Color(128, 0, 64));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(267, 54, 129, 25);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(26, 97, 161, 17);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(186, 94, 64, 19);
		contentPane.add(element2);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem;
				elem =Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				
				if(first==null) {
					first = newnode;
					String message ="Inserted element is"+newnode.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element2.setText("");
					
					
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
					String message ="Inserted element is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element2.setText("");
				}
				
			}
		});
		insertfront.setForeground(new Color(128, 0, 64));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(267, 89, 129, 25);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear
				Node temp;
				if(first==null) {
					String message ="Deletion not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
				}else if(first.nextlink==null){
					
					String message ="Element delete is "+ first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					
				temp=first;
				while(temp.nextlink.nextlink!=null) {
					temp=temp.nextlink;
				}
					
					
					String message ="Element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setForeground(new Color(128, 0, 64));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(150, 124, 129, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front
				Node temp;
				if(first==null) {
					String message ="Deletion not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
				}else if(first.nextlink==null){
					
					String message ="Element delete is "+ first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else
				{
					
					String message ="Enter deleted  "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.nextlink;
					first.prelink=null;
					
				}
				
			}
		});
		deletefront.setForeground(new Color(128, 0, 64));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(150, 159, 141, 25);
		contentPane.add(deletefront);
		
		JButton display1 = new JButton("DISPLAYFORWARD");
		display1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display forward
				String msg="";
				Node temp;
				if(first == null) {
					String message ="Display not Possible";
		JOptionPane.showMessageDialog(contentPane, message);
		displaybox.setText("");
					
				}
				else if(first.nextlink == null) {
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}else {
					temp = first;
					while(temp!=null) {
						msg=msg+" "+temp.data+" ";
		             
						temp = temp.nextlink;
						
					}
					 displaybox.setText(msg);
				}
			}
			});
		display1.setForeground(new Color(0, 0, 0));
		display1.setFont(new Font("Corbel", Font.BOLD, 13));
		display1.setBounds(26, 197, 175, 27);
		contentPane.add(display1);
		
		JButton display2 = new JButton("DISPLAYREVERSE");
		display2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dispaly reverse
				String msg="";
				Node temp;
				if(first == null) {
					String message ="Display not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
					displaybox.setText("");
				}
				else if(first.nextlink == null) {
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}else {
					temp = first;
					while(temp.nextlink!=null) {
						
						temp = temp.nextlink;
						
						
					}
					while(temp!=null) {
						msg =msg+" "+temp.data+" ";
						temp=temp.prelink;
					}
					displaybox.setText(msg);
			}
			}
		});
		display2.setFont(new Font("Constantia", Font.BOLD, 13));
		display2.setBounds(242, 198, 166, 25);
		contentPane.add(display2);
		
		displaybox = new JTextField();
		displaybox.setBounds(79, 234, 276, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
