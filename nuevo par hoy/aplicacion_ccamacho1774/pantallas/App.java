package pantallas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dao_Usuarios.UsuariosException;
import modelo_PY.Registro;
import modelo_PY.Usuario;
import service_PY.ContraseñaException;
import service_PY.EmailException;
import service_PY.RegistroException;
import service_PY.RegistroService;
import service_PY.UsuarioService;

public class App {

	private JFrame frame;
	private LoginView pantallaLogin;
	private BienvenidaView pantallaBienvenida;
	private ConsultarRegistro pantallaConsultarRegistro;
	private NuevoRegistroView pantallaNuevoRegistro;
	private SolocitarAccesoView pantallaSolicitarAcceso;
	private JMenuBar menuBar_App;
	private Usuario usuario;
	private Usuario usuarioPrueba;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		pantallaBienvenida = new BienvenidaView(this);
		pantallaConsultarRegistro = new ConsultarRegistro(this);
		pantallaNuevoRegistro = new NuevoRegistroView(this);
		pantallaLogin = new LoginView(this);
		initialize();
	}
	
	public Usuario getUsuarioPrueba() {
		return usuarioPrueba;
	}
	
	public void setUsuarioPrueba(Usuario usuarioPrueba) {
		this.usuarioPrueba = usuarioPrueba;
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar_App = new JMenuBar();
		frame.setJMenuBar(menuBar_App);

		JMenu MenuApp_Salir = new JMenu("App");
		menuBar_App.add(MenuApp_Salir);

		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesion");
		MenuApp_Salir.add(mntmCerrarSesion);
		mntmCerrarSesion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				irApantallaLogin();
			}
		});

		JMenuItem mntmSalir = new JMenuItem("Salir");
		MenuApp_Salir.add(mntmSalir);
		mntmSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		JMenu MenuApp_Registros = new JMenu("Registros");
		menuBar_App.add(MenuApp_Registros);

		JMenuItem mntmCrear = new JMenuItem("Crear nuevo registro");
		MenuApp_Registros.add(mntmCrear);
		mntmCrear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				irAPantallaNuevoRegistro();
			}
		});

		JMenuItem mntmConsultarRegistros = new JMenuItem("Consultar Registros");
		MenuApp_Registros.add(mntmConsultarRegistros);
		pantallaSolicitarAcceso = new SolocitarAccesoView(this);
		mntmConsultarRegistros.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				irAPantallaConsultarRegistro();

			}
		});

		irApantallaLogin();

	}

	public void insertarUsuario(Usuario user) {

		UsuarioService usuarioService = new UsuarioService();

		try {
			usuarioService.registrarUsuario(user);
		} catch (UsuariosException | RegistroException e) {

			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERROR LOS DATOS YA EXISTEN",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	public void iniciarSesion(String email, String contraseña) {

		UsuarioService usuarioService = new UsuarioService();

		try {
			usuario = usuarioService.iniciarSesion(email, contraseña);
			irAPantallaBienvenida();
		} catch (EmailException | ContraseñaException | UsuariosException e) {

			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERROR AL INTRODUCIR LOS DATOS",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public void irAPantallaBienvenida() {
		frame.setContentPane(pantallaBienvenida);
		menuBar_App.setVisible(true);
		frame.revalidate();
	}

	public void irAPantallaConsultarRegistro() {
		frame.setContentPane(pantallaConsultarRegistro);
		menuBar_App.setVisible(true);
		frame.revalidate();
	}

	public void irAPantallaNuevoRegistro() {
		frame.setContentPane(pantallaNuevoRegistro);
		menuBar_App.setVisible(true);
		frame.revalidate();
	}

	public void irApantallaLogin() {
		frame.setContentPane(pantallaLogin);
		menuBar_App.setVisible(false);
		frame.revalidate();
	}

	public void irAPantallaSolicitarAcceso() {
		frame.setContentPane(pantallaSolicitarAcceso);
		menuBar_App.setVisible(false);
		frame.revalidate();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public List<Registro> devolverRegistro(){
		RegistroService rs = new RegistroService();
		try {
			return rs.consultarRegistroUsuario(usuarioPrueba.getId_Usuario());
		} catch (RegistroException e) {
			JOptionPane.showMessageDialog(frame, e.getMessage(), "PROBLEMA AL CONSULTAR LA LISTA DE REGISTROS",
					JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}

}
