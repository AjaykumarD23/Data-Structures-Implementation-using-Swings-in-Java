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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private int[] cq;
	private int size;
	private int r=-1;
	private int f=0;
	private int count = 0;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel.setBounds(97, 10, 262, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE : ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBounds(53, 41, 146, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(198, 41, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton cqueue = new JButton("CREATE QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CREATE QUEUE
				size = Integer.valueOf(sizefield.getText());
				cq =new int[size];
				String message = "Queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
			}
		});
		cqueue.setForeground(new Color(128, 64, 64));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 13));
		cqueue.setBounds(147, 76, 145, 25);
		contentPane.add(cqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT : ");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(64, 115, 146, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(208, 113, 60, 19);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//INSERT CIRCULAR
				
				int elem;
				if(count ==size) {
					String message ="Insert not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
				}
				else {
					
					elem =Integer.valueOf(element.getText());
					r =(r+1)%size;
					cq[r]=elem;
					count++;
					String message ="Inserted element is"+cq[r];
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
					
				}
			}
		});
		btnInsert.setForeground(new Color(128, 64, 64));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 13));
		btnInsert.setBounds(301, 111, 114, 25);
		contentPane.add(btnInsert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE QUEUE
				if(count ==0) {
					String message ="Element not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					String message ="Element deleted is :"+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(128, 64, 64));
		delete.setFont(new Font("Constantia", Font.BOLD, 13));
		delete.setBounds(180, 152, 114, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY QUEUE
				String msg="";
				int f1=f;
				if(count ==0) {
					String message ="Display Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
					
				}
				else
				{
					for(int i=1; i<=count;i++) {
						msg=msg+" "+cq[f1];
						f1 =(f1+1)%size;
					}
					displaybox.setText(msg);
					
				}
			}
		});
		display.setForeground(new Color(128, 64, 64));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(180, 187, 114, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(97, 234, 262, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
