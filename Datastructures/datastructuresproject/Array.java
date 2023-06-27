package datastructuresproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel arraydatastructure = new JLabel("ARRAY DATA STRUCTURE");
		arraydatastructure.setForeground(new Color(0, 0, 255));
		arraydatastructure.setFont(new Font("Algerian", Font.BOLD, 15));
		arraydatastructure.setBounds(113, 28, 209, 21);
		contentPane.add(arraydatastructure);
		
		JLabel enterarraylength = new JLabel("ENTER ARRAY LENGTH :");
		enterarraylength.setForeground(new Color(255, 0, 0));
		enterarraylength.setFont(new Font("Constantia", Font.BOLD, 13));
		enterarraylength.setBounds(23, 68, 184, 17);
		contentPane.add(enterarraylength);
		
		length = new JTextField();
		length.setBounds(213, 65, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create array btn
				
				//String len=length.getText();
				//int l=Integer.valueOf(len);
				//commented two lines of code we write in one line 
				
				int len =Integer.valueOf(length.getText());
				arr=new int[len];
				String message = "Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(128, 64, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 13));
		create.setBounds(156, 95, 142, 25);
		contentPane.add(create);
		
		JLabel enterelement = new JLabel("ENTER AN INTEGER ELEMENT :");
		enterelement.setForeground(new Color(128, 0, 128));
		enterelement.setFont(new Font("Constantia", Font.PLAIN, 12));
		enterelement.setBounds(14, 130, 193, 17);
		contentPane.add(enterelement);
		
		element = new JTextField();
		element.setBounds(197, 130, 39, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("POSITION :");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(246, 130, 76, 15);
		contentPane.add(lblNewLabel_2);
		
		insertposition = new JTextField();
		insertposition.setBounds(324, 127, 39, 19);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Insert btn
				int elem = Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message ="Element "+elem+" Inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
				
			}
		});
		insert.setForeground(new Color(128, 64, 64));
		insert.setFont(new Font("Constantia", Font.BOLD, 12));
		insert.setBounds(376, 128, 87, 21);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ENTER THE POSITION : ");
		lblNewLabel_1_1_1.setForeground(Color.RED);
		lblNewLabel_1_1_1.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(23, 176, 142, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(180, 173, 56, 19);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete btn
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message = "Element Deleted@the position"+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
				
			}
		});
		delete.setForeground(new Color(128, 64, 64));
		delete.setFont(new Font("Constantia", Font.BOLD, 13));
		delete.setBounds(267, 172, 96, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Display btn
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(44, 211, 65));
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(169, 202, 109, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 255));
		displaybox.setBounds(78, 253, 329, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
