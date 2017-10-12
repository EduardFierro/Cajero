package CajeroUdec;

import java.awt.*;
import javax.swing.*;

public class VentanaCajero extends JFrame {
	public static PanelArriba panelArriba;
	public static PanelInicial panelInicial;
	public static PanelFunciones panelFunciones;
	public static PanelIzquierdo panelIzquierdo;
	public static PanelDerecho panelDerecho;
	public static PanelAbajo panelAbajo;
	public static PanelUser panelUser;
	public static PanelRetiro panelRetiro;
	public static PanelConfirmacion panelConfirmacion;
	public static PanelConsulta panelConsulta;
	public static PanelTransfers panelTransfers;
	public static PanelPagos panelPagos;
	public static PanelClave panelClave;

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
		this.setLocationRelativeTo(null);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	public void componentes() {

		// Creación de los paneles aquí
		panelArriba = new PanelArriba();
		add(panelArriba, BorderLayout.NORTH);

		panelAbajo = new PanelAbajo();
		add(panelAbajo, BorderLayout.SOUTH);

		panelIzquierdo = new PanelIzquierdo();
		add(panelIzquierdo, BorderLayout.WEST);

		panelDerecho = new PanelDerecho();
		add(panelDerecho, BorderLayout.EAST);
		
		panelInicial = new PanelInicial();
		panelRetiro = new PanelRetiro();
		panelConfirmacion = new PanelConfirmacion();
		panelConsulta = new PanelConsulta();
		panelTransfers = new PanelTransfers();
		panelPagos = new PanelPagos();
		panelClave = new PanelClave();
		panelFunciones = new PanelFunciones();
		add(panelTransfers, BorderLayout.CENTER);

	}

	public void visibleUser() {
		panelUser.setVisible(true);

	}
}
