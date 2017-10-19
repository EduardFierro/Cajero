package CajeroUdec;

import java.awt.*;
import javax.swing.*;

public class VentanaCajero extends JFrame {
	public static PanelPrincipal panelPrincipal;

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

		panelPrincipal = new PanelPrincipal();
		add(panelPrincipal);
		
	}

	
}
