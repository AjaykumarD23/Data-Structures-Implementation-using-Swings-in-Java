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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(117, 22, 219, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(27, 56, 193, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(197, 53, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATE STACK
				size = Integer.valueOf(sizefield.getText());
				s =new int[size];
				String message = "Stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 13));
		stack.setForeground(new Color(128, 64, 64));
		stack.setBounds(117, 83, 142, 25);
		contentPane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(47, 118, 138, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(197, 118, 73, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PUSH BUTTON
				int ele;
				if(top==size-1){
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}else {
					ele =Integer.valueOf(element.getText());
					++top;
					s[top]=ele;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
				
				
			}
		});
		push.setForeground(new Color(128, 64, 64));
		push.setFont(new Font("Constantia", Font.BOLD, 13));
		push.setBounds(294, 114, 81, 25);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//POP BUTTON
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Pop is not Successfull");
				}else {
					String message = "Element deleted is : "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(128, 64, 64));
		pop.setFont(new Font("Constantia", Font.BOLD, 13));
		pop.setBounds(186, 147, 73, 25);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPAY BUTTON
				String msg="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}else {
					for(int i=top;i>=0;i--) {
					msg = msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(44, 211, 65));
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(164, 182, 106, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 255, 255));
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setBounds(22, 234, 372, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
