package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SolocitarAcceso {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolocitarAcceso window = new SolocitarAcceso();
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
	public SolocitarAcceso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(157, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(157, 29, 146, 14);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(157, 53, 75, 14);
		frame.getContentPane().add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 70, 146, 14);
		frame.getContentPane().add(textField_1);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contraseña:");
		lblRepetirContrasea.setBounds(157, 101, 113, 14);
		frame.getContentPane().add(lblRepetirContrasea);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 126, 146, 14);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(157, 151, 113, 14);
		frame.getContentPane().add(lblNombre);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 176, 146, 14);
		frame.getContentPane().add(textField_3);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(157, 201, 113, 14);
		frame.getContentPane().add(lblApellidos);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(157, 226, 146, 14);
		frame.getContentPane().add(textField_4);
		
		JLabel lblCicloFormativo = new JLabel("Ciclo Formativo:");
		lblCicloFormativo.setBounds(157, 253, 113, 14);
		frame.getContentPane().add(lblCicloFormativo);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(265, 336, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(364, 336, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}

}
