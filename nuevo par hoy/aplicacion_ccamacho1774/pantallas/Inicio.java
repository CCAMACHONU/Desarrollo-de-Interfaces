package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Inicio {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(152, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(152, 91, 168, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(152, 122, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 147, 168, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(240, 178, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSolicitarAcceso = new JButton("Solicitar acceso");
		btnSolicitarAcceso.setBounds(240, 227, 89, 23);
		frame.getContentPane().add(btnSolicitarAcceso);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(339, 227, 89, 23);
		frame.getContentPane().add(btnSalir);
	}
}
