package pantallas;


import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class NuevoRegistroView extends View{


	
	private static final long serialVersionUID = 807976910389396341L;
	private JTextField textField;

	
	public NuevoRegistroView(App appController) {
		super(appController);
		setLayout(null);
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(106, 61, 56, 14);
		add(lblFecha);
		
		JComboBox comboBox_Fecha = new JComboBox();
		comboBox_Fecha.setBounds(106, 86, 117, 22);
		add(comboBox_Fecha);
		
		JLabel lblHoras = new JLabel("Horas:");
		lblHoras.setBounds(106, 126, 56, 14);
		add(lblHoras);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(16);
		slider.setBounds(106, 155, 208, 36);
		add(slider);
		
		JLabel lblTareasRealizadas = new JLabel("Tareas Realizadas:");
		lblTareasRealizadas.setBounds(106, 202, 96, 14);
		add(lblTareasRealizadas);
		
		JButton Boton_Aceptar = new JButton("Aceptar");
		Boton_Aceptar.setBounds(255, 390, 89, 23);
		add(Boton_Aceptar);
		Boton_Aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				appController.irAPantallaBienvenida();
				
			}
		});
		
		JButton Boton_Cancelar = new JButton("Cancelar");
		Boton_Cancelar.setBounds(354, 390, 89, 23);
		add(Boton_Cancelar);
		textField = new JTextField();
		textField.setBounds(106, 227, 208, 91);
		add(textField);
		textField.setColumns(10);
		Boton_Cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				appController.irAPantallaBienvenida();
			}
		});
	}
}
