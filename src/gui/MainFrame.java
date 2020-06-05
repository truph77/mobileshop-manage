package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.customer.CustomerDialog;
import gui.product.ProductDialog;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JPanel northPanel;
	private JPanel centerPanel;

	private JButton productBtn;
	private JButton customerBtn;
	private JButton orderBtn;

	private ProductDialog productDialog;
	private CustomerDialog customerDialog;

	public MainFrame() {

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));

		northPanel = new JPanel();
		centerPanel = new JPanel();

		productBtn = new JButton("PRODUCTS");
		customerBtn = new JButton("CUSTOMERS");
		orderBtn = new JButton("ORDERS");

		productBtn.addActionListener(this);
		customerBtn.addActionListener(this);
		orderBtn.addActionListener(this);

		northPanel.setLayout(new FlowLayout());
		northPanel.add(productBtn);
		northPanel.add(customerBtn);
		northPanel.add(orderBtn);
		northPanel.setPreferredSize(new Dimension(1050, 50));
		northPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		JLabel logoLbl = new JLabel("This is a logo.");
		centerPanel.add(logoLbl);
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

		contentPane.add(northPanel, BorderLayout.NORTH);
		contentPane.add(centerPanel, BorderLayout.CENTER);

		// default setting
		setTitle("Mobile Shop Management System");
		setContentPane(contentPane);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 70, 650, 450);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		if (btn == productBtn) {
			productDialog = new ProductDialog();
		} else if (btn == customerBtn) {
			customerDialog = new CustomerDialog();
		} else if (btn == orderBtn) {

		}
	}

}
