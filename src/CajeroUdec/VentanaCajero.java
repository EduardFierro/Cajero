package CajeroUdec;

import java.awt.*;
import javax.swing.*;

public class VentanaCajero extends JFrame {
	PanelArriba panelArriba;
	PanelCentral1 panelCentral1;
	PanelCentral2 panelCentral2;
	PanelIzquierdo panelIzquierdo;
	PanelDerecho panelDerecho;
	PanelAbajo panelAbajo;

	VentanaCajero() {
		super("CAJERO UDEC");
		iniciar();
		componentes();
		setVisible(true);
		pack();
		// Centrar la ventana
		setLocationRelativeTo(null);
	}

	public VentanaCajero iniciar() {

		Dimension dims = new Dimension(900, 700);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	public void componentes() {

		// Creación de los paneles aquí
		panelArriba = new PanelArriba();
		add(panelArriba, BorderLayout.NORTH);

		panelAbajo = new PanelAbajo();
		add(panelAbajo, BorderLayout.SOUTH);

		panelCentral1 = new PanelCentral1();
		add(panelCentral1, BorderLayout.CENTER);
		panelCentral1.setVisible(true);
		
		/*panelCentral2 = new PanelCentral2();
		add(panelCentral2, BorderLayout.CENTER);
		panelCentral2.setVisible(true);*/
		
		panelIzquierdo = new PanelIzquierdo();
		add(panelIzquierdo, BorderLayout.WEST);
		
		panelDerecho = new PanelDerecho(); 
		add(panelDerecho, BorderLayout.EAST);
	}

}
