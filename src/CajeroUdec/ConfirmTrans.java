package CajeroUdec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConfirmTrans extends JFrame {
	public static int claveconfirm;
	public static PanelPrincipal panelPrincipal;
	public static PanelUser panelUser;
	public static PanelTransfers panelTransfers;
	public static JTextField clave;
	public static int []tran;
	public ConfirmTrans() {
		this("Confirmación clave");
	}

	public ConfirmTrans(String titulo) {
		super(titulo);

		this.iniciar();
		this.configurarPanelConfirmacion();

		this.pack();
		this.setVisible(true);
	}

	private ConfirmTrans iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}

	private void configurarPanelConfirmacion() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;

		JLabel titulo = new JLabel("Digita tu clave, por favor");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);

		clave = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(clave, constraint);

		JButton aceptar = new JButton("ACEPTAR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar, constraint);
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confir = Integer.parseInt(clave.getText());
				if (confir == 0 || clave.equals("")) {
					JOptionPane.showMessageDialog(null, "Campo clave vacio");
				} else {
					if (confir==panelUser.resulClave) {
						System.out.println("Clave correcta");
						if (panelTransfers.valTrans <= PanelUser.resulSaldo-2000) {
							PanelUser.resulSaldo = PanelUser.resulSaldo - panelTransfers.valTrans;
							System.out.println("Transferencia exitosa, Saldo: " + PanelUser.resulSaldo);
							tran[0]=panelTransfers.valTrans;
							panelPrincipal.msjdinero.setText("Transferencia exitosa");
						} else {
							System.out.println("Transferencia no realizada, saldo insuficiente");
							panelPrincipal.msjdinero.setText("Transferencia no realizada, saldo insuficiente");
						}
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Clave incorrecta");
						clave.setText(null);
					}
				}
			}
		});

	}

	public void ConfirmarClave() {
		claveconfirm = Integer.parseInt(clave.getText());
	}
}
