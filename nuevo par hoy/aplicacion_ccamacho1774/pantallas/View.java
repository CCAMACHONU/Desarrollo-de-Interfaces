package pantallas;

import javax.swing.JPanel;

public abstract class View extends JPanel {

	protected App appController;
	private static final long serialVersionUID = 1498021941574423683L;
	


	public View(App appController) {
		this.appController = appController;
		
	}
	/**
	 * Launch the application.
	 */
	
}
