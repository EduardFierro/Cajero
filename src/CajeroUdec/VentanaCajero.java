package CajeroUdec;

import java.awt.*;
import javax.swing.*;

public class VentanaCajero extends JFrame {
	PanelArriba panelArriba;
	PanelInicial panelInicial;
	PanelFunciones panelFunciones;
	PanelIzquierdo panelIzquierdo;
	PanelDerecho panelDerecho;
	PanelAbajo panelAbajo;
	PanelUser panelUser;
	PanelRetiro panelRetiro;
	PanelConfirmacion panelConfirmacion;

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
		this.setBackground(Color.GREEN);
		this.setLocationRelativeTo(null);setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	public void componentes() {

		//Creación de los paneles aquí
		panelArriba = new PanelArriba();
		add(panelArriba, BorderLayout.NORTH);

		panelAbajo = new PanelAbajo();
		add(panelAbajo, BorderLayout.SOUTH);

		/*panelFunciones = new PanelFunciones();
		add(panelFunciones, BorderLayout.CENTER);
		panelFunciones.setVisible(true);
		
		panelRetiro = new PanelRetiro();
		add(panelRetiro, BorderLayout.CENTER);
		
		panelInicial = new PanelInicial();
		add(panelInicial, BorderLayout.CENTER);
		panelInicial.setVisible(true);*/
		
		panelConfirmacion = new PanelConfirmacion();
		add(panelConfirmacion, BorderLayout.CENTER);
		
		panelIzquierdo = new PanelIzquierdo();
		add(panelIzquierdo, BorderLayout.WEST);
		
		panelDerecho = new PanelDerecho(); 
		add(panelDerecho, BorderLayout.EAST);
	}
	

	public void visibleUser() {
		panelUser.setVisible(true);
		
	}
}
