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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizeelem;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(100, 20, 211, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(33, 66, 149, 17);
		contentPane.add(lblNewLabel_1);
		
		sizeelem = new JTextField();
		sizeelem.setBounds(169, 63, 96, 19);
		contentPane.add(sizeelem);
		sizeelem.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create queue
				size = Integer.valueOf(sizeelem.getText());
				q =new int[size];
				String message = "Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		queue.setForeground(new Color(128, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 13));
		queue.setBounds(135, 93, 149, 25);
		contentPane.add(queue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMET : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(33, 133, 141, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(169, 128, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Insert  queue
				int elem;
				if(r==size-1) {
					String message = "Insertion not possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
					
				}else {
					elem =Integer.valueOf(element.getText());
					
					++r;
					q[r]=elem;
                   String message = "Element deleted is "+q[r];
					
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(128, 64, 64));
		insert.setFont(new Font("Constantia", Font.BOLD, 13));
		insert.setBounds(297, 129, 96, 25);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Delete queue
				if(r==-1||f>r) {
					String message = "Deletion is not possible";
					
					JOptionPane.showMessageDialog(contentPane, message);
					
				}else {
                    String message = "Element deleted is "+q[f];
					
					JOptionPane.showMessageDialog(contentPane, message);
					
					++f;
				}
			}
		});
		delete.setForeground(new Color(128, 64, 64));
		delete.setFont(new Font("Constantia", Font.BOLD, 13));
		delete.setBounds(180, 157, 104, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display queue
				String msg="";
				if(r==-1||f>r) {
					
                 String message = "Display not Possible";
					
					JOptionPane.showMessageDialog(contentPane, message);
					
					
				}else {
					for(int i=f;i<=r;i++) {
						
					
						msg = msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
					
			}
		});
		display.setForeground(new Color(255, 128, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(180, 192, 104, 27);
		contentPane.add(display);
		
		
		displaybox = new JTextField();
		displaybox.setBounds(69, 229, 334, 24);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
