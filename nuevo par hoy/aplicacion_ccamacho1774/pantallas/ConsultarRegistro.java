package pantallas;


import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ConsultarRegistro extends View {


	private static final long serialVersionUID = -7600542501074712902L;
	private JTable table;


	public ConsultarRegistro(App appController) {
		super(appController);
		
		setLayout(null);
		
		JScrollPane ScrollPane_Taras = new JScrollPane();
		ScrollPane_Taras.setBounds(22, 22, 389, 172);
		add(ScrollPane_Taras);
		
		table = new JTable();
		ScrollPane_Taras.setViewportView(table);
		
		JButton Boton_Refrescar = new JButton("Refrescar");
		Boton_Refrescar.setBounds(310, 205, 89, 23);
		add(Boton_Refrescar);
	}
	
	
	
	
		
}
