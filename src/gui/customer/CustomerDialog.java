package gui.customer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CustomerDialog extends JDialog {

	private JPanel contentPanel;
	
	public CustomerDialog() {
		setBounds(120, 50, 1050, 600);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		setTitle("CUSTOMERS");
	}

}
