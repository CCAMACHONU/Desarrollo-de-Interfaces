package pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import modelo_PY.Usuario;

public class SolocitarAccesoView extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1975890556634402047L;
	private JTextField textField_Nombre;
	private JTextField textField_Apellidos;
	private JTextField textField_Email;
	private JPasswordField password1Field;
	private JPasswordField password2Field;
	private JComboBox comboBoxCicloFormativo;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public SolocitarAccesoView(App appController) {
		super(appController);
		setLayout(null);
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(157, 11, 46, 14);
		add(lblNewLabel);

		textField_Email = new JTextField();
		textField_Email.setBounds(157, 29, 146, 23);
		add(textField_Email);
		textField_Email.setColumns(10);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(157, 53, 75, 14);
		add(lblContrasea);

		JLabel lblRepetirContrasea = new JLabel("Repetir Contraseña:");
		lblRepetirContrasea.setBounds(157, 101, 113, 14);
		add(lblRepetirContrasea);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(157, 151, 113, 14);
		add(lblNombre);

		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(157, 201, 113, 14);
		add(lblApellidos);

		JLabel lblCicloFormativo = new JLabel("Ciclo Formativo:");
		lblCicloFormativo.setBounds(157, 253, 113, 14);
		add(lblCicloFormativo);

		JButton BotonAceptar = new JButton("Aceptar");
		BotonAceptar.setBounds(265, 336, 89, 23);
		add(BotonAceptar);
		BotonAceptar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Usuario usuario = new Usuario();

				char[] contra = password1Field.getPassword();
				char[] contra2 = password2Field.getPassword();

				String pass = String.valueOf(contra);
				String pass2 = String.valueOf(contra2);

				if (pass.equals(pass2) || !pass.isEmpty() || !textField_Email.getText().isEmpty()
						|| !textField_Nombre.getText().isBlank() || comboBoxCicloFormativo.getSelectedItem() != null) {

					usuario.setEmail(textField_Email.getText());
					usuario.setNombre(textField_Nombre.getText());
					usuario.setApellidos(textField_Apellidos.getText());
					usuario.setContraseña(pass);
					usuario.setCiclo((String) comboBoxCicloFormativo.getSelectedItem());
					
					
					appController.insertarUsuario(usuario);

				} 
				
				appController.irApantallaLogin();

			}
		});

		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appController.irApantallaLogin();
			}
		});
		botonCancelar.setBounds(364, 336, 89, 23);
		add(botonCancelar);

		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		textField_Nombre.setBounds(157, 167, 146, 23);
		add(textField_Nombre);

		textField_Apellidos = new JTextField();
		textField_Apellidos.setColumns(10);
		textField_Apellidos.setBounds(157, 219, 146, 23);
		add(textField_Apellidos);

		comboBoxCicloFormativo = new JComboBox();
		comboBoxCicloFormativo.setBounds(157, 277, 146, 22);
		comboBoxCicloFormativo.addItem("DAM");
		comboBoxCicloFormativo.addItem("DAW");
		comboBoxCicloFormativo.addItem("AZIR");
		add(comboBoxCicloFormativo);

		password1Field = new JPasswordField();
		password1Field.setBounds(157, 70, 146, 20);
		add(password1Field);

		password2Field = new JPasswordField();
		password2Field.setBounds(157, 120, 146, 20);
		add(password2Field);
	}
}