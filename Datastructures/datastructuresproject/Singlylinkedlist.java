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

public class Singlylinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private JTextField element2;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singlylinkedlist frame = new Singlylinkedlist();
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
	public Singlylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel.setBounds(75, 10, 319, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 53, 156, 17);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(176, 50, 69, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT REAR END
				Node temp;
				int elem;
				elem =Integer.valueOf(element.getText());
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					String message ="Inserted element is"+newnode.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}else
				{
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
						
					}
					temp.link=newnode;
					String message ="Inserted element is"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insertrear.setForeground(new Color(128, 64, 64));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(287, 53, 128, 21);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT : ");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(10, 89, 156, 17);
		contentPane.add(lblNewLabel_1_1);
		
		element2 = new JTextField();
		element2.setColumns(10);
		element2.setBounds(176, 86, 69, 19);
		contentPane.add(element2);
		
		JButton insertfront = new JButton("INSERT FRONT ");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT FRONT
				int elem1;
				elem1 =Integer.valueOf(element2.getText());
				Node newnode = new Node();
				newnode.data = elem1;
				newnode.link=null;
				if(first==null) {
					first=newnode;
					String message ="Inserted element is"+newnode.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element2.setText("");
				}else
				{
					newnode.link=first;
					first=newnode;
					String message ="Inserted element is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					element2.setText("");
					
				}
			}
		});
		insertfront.setForeground(new Color(128, 64, 64));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(287, 85, 139, 21);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DELETE REAR
				
				Node temp;
				if(first==null) {
					String message ="deletion is not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}else if(first.link==null){
					String message ="Element delete is :"+first.data ;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
					
					
				}else
				{
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					String message ="Element deleted is"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
			}
		});
		deleterear.setForeground(new Color(128, 64, 64));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(146, 116, 149, 21);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE FRONT

				if(first==null) {
					String message ="deletion is not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
				}else if(first.link==null){
					String message ="Element delete is :"+first.data ;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
					
					
				}else
				{
					
					first=first.link;
					String message ="Element delete is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					}
					
			}
		});
		deletefront.setForeground(new Color(128, 64, 64));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(146, 147, 149, 25);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY 
				String msg="";
				Node temp;
				if(first==null)
				{
					String message ="Display not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}else if(first.link==null) {
					msg=msg+" "+first.data;
					
					displaybox.setText(msg);
					
					
				}else
				{
					temp =first;
					while(temp!=null) {
						msg=msg+" "+temp.data+" ";
						temp=temp.link;
						
						
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(64, 0, 128));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(146, 182, 149, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(62, 234, 313, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
