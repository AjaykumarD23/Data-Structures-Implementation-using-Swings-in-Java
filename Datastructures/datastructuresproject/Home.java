package datastructuresproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel chooseadatastructure = new JLabel("CHOOSE A DATASTRUCTURE");
		chooseadatastructure.setForeground(new Color(255, 0, 0));
		chooseadatastructure.setFont(new Font("Algerian", Font.BOLD, 18));
		chooseadatastructure.setBounds(90, 10, 248, 24);
		contentPane.add(chooseadatastructure);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(new Color(255, 0, 128));
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
				//Array a= new Array();
				//a.setVisible(true);
				//I will make the two lines in one line
				new Array().setVisible(true);
			}
		});
		array.setBounds(172, 44, 99, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(0, 0, 160));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(33, 98, 99, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 0, 255));
		queue.setFont(new Font("Constantia", Font.BOLD, 13));
		queue.setBounds(313, 99, 90, 25);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(44, 211, 65));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 13));
		cqueue.setBounds(33, 160, 173, 25);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLYLINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLINKEDLIST WINDOW OPENING CODE HERE
				new Singlylinkedlist().setVisible(true);
			}
		});
		sll.setForeground(new Color(128, 64, 64));
		sll.setFont(new Font("Constantia", Font.BOLD, 13));
		sll.setBounds(230, 160, 173, 25);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLYLINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLYLINKEDLIST WINDOW OPENING CODE HERE
				new Doublylinkedlist ().setVisible(true);
			}
		});
		dll.setForeground(new Color(255, 128, 0));
		dll.setFont(new Font("Constantia", Font.BOLD, 13));
		dll.setBounds(120, 214, 188, 25);
		contentPane.add(dll);
	}
}
