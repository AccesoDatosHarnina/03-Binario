package sistemavalidacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Pattern;

public class Vista extends JFrame {

	private JPanel contentPane;
	protected JTextField textField;
	private JTextField textField_1;

	
	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(39, 101, 46, 14);
		contentPane.add(lblTelefono);
		
		textField = new JTextField();
		
		textField.setBounds(115, 98, 97, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 143, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
