package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class OrderUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField ruler;
	private JTextField pen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderUi frame = new OrderUi();
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
	public OrderUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(41, 20, 542, 52);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("文具購物系統");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(41, 89, 542, 194);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("姓名");
		lblNewLabel_1.setBounds(28, 10, 52, 35);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("尺");
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		lblNewLabel_2.setBounds(28, 55, 46, 32);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("筆");
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		lblNewLabel_3.setBounds(28, 97, 46, 38);
		panel_1.add(lblNewLabel_3);
		
		name = new JTextField();
		name.setBounds(167, 10, 177, 35);
		panel_1.add(name);
		name.setColumns(10);
		
		ruler = new JTextField();
		ruler.setBounds(167, 55, 177, 35);
		panel_1.add(ruler);
		ruler.setColumns(10);
		
		pen = new JTextField();
		pen.setBounds(167, 100, 177, 35);
		panel_1.add(pen);
		pen.setColumns(10);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(41, 304, 542, 145);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea output = new JTextArea();
		output.setBounds(10, 10, 522, 125);
		panel_2.add(output);

		/********event********/
		
		
		JButton btnNewButton = new JButton("新增訂單");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.讀取 name,ruler,pen-->getText()
				 * 2.Order o=new Order(name,ruler,pen)
				 * 3.output.setText();
				 */
				
				String Name=name.getText();
				String Ruler=ruler.getText();
				String Pen=pen.getText();
				
				//Integer R=new Integer(Ruler);
				//Integer P=new Integer(Pen);
				
				int R=Integer.parseInt(Ruler);
				int P=Integer.parseInt(Pen);
				
				Order o=new Order(Name,R,P);
				
				output.setText("訂單細目:"+""
						+"\n姓名:"+o.getName()
						+"\n尺:"+o.getRuler()
						+"\n筆:"+o.getPen()
						+"\n共:"+o.getSum()+"元");
				
			
				
				
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		btnNewButton.setBounds(167, 146, 177, 38);
		panel_1.add(btnNewButton);
		
	}

}
