package pantallas;


import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class BienvenidaView extends View {
	
	private JLabel Label_Bienvenida;
	
	private JLabel lblBienvenida;
	
	private static final long serialVersionUID = -1541745109735952352L;
	
	public BienvenidaView(App AppController) {
		super(appController);			
		setLayout(null);
		
		lblBienvenida = new JLabel();
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setLabelFor(this);
		lblBienvenida.setBounds(93, 108, 246, 76);
		add(lblBienvenida);
		
	}
	public void actualizar() {
		lblBienvenida.setText("BIENVENIDO " + App.getUsuarioPrueba().getNombre());
	}

	/**
	 * 
	 */

}
