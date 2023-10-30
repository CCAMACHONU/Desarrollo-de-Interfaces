package pantallas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo_PY.Usuario;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginView extends View {

	private static final long serialVersionUID = -4199939737363340711L;
	private JTextField textField_email;
	private JPasswordField passwordField;

	public LoginView(App appController) {
		super(appController);

		setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 146, 168, 21);
		add(passwordField);
		
		JLabel Label_Email = new JLabel("Email:");
		Label_Email.setBounds(152, 66, 46, 14);
		add(Label_Email);

		textField_email = new JTextField();
		textField_email.setBounds(152, 91, 168, 20);
		add(textField_email);
		textField_email.setColumns(10);

		JLabel Label_contraseña = new JLabel("Contraseña:");
		Label_contraseña.setBounds(152, 122, 70, 14);
		add(Label_contraseña);

		JButton Boton_Entrar = new JButton("Entrar");
		Boton_Entrar.setBounds(240, 178, 89, 23);
		add(Boton_Entrar);
		Boton_Entrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				appController.iniciarSesion(textField_email.getText(), String.valueOf(passwordField.getPassword()));

			}
		});

		JButton boton_SolicitarAcceso = new JButton("Solicitar acceso");
		boton_SolicitarAcceso.setBounds(240, 227, 89, 23);
		add(boton_SolicitarAcceso);

		boton_SolicitarAcceso.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				appController.irAPantallaSolicitarAcceso();

			}
		});

		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(339, 227, 89, 23);
		add(BotonSalir);
		

		BotonSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
