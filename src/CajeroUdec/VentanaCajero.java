package CajeroUdec;

import java.awt.*;
import javax.swing.*;

public class VentanaCajero extends JFrame {
	public static PanelArriba panelArriba;
	public static PanelCentro panelCentro;
	public static PanelAbajo panelAbajo;

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

		Dimension dims = new Dimension(900, 750);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(new BorderLayout());
		this.setBackground(Color.LIGHT_GRAY);
		this.setLocationRelativeTo(null);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	public void componentes() {

		// Creación de los paneles aquí
		panelArriba = new PanelArriba();
		add(panelArriba, BorderLayout.NORTH);
		
		panelCentro = new PanelCentro();
		add(panelCentro, BorderLayout.CENTER);
		
		panelAbajo = new PanelAbajo();
		add(panelAbajo, BorderLayout.SOUTH);
	}

	
}
