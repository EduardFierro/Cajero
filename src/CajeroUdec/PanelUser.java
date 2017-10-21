package CajeroUdec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PanelUser extends JFrame {

	public static ArrayList<Usuario> user = new ArrayList();
	public static int resulSaldo, resulCedula, resulClave, auxCed;

	public PanelUser() {
		this("Registro Usuario");
	}

	public PanelUser(String titulo) {
		super(titulo);

		this.iniciar(); 
		this.configurarPanelUser();

		this.pack();
		this.setVisible(true);
	}

	private PanelUser iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}

	private void configurarPanelUser() {

		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JLabel titulo = new JLabel("DATOS USUARIO");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		add(titulo, constraint);

		JLabel cedula = new JLabel("CÉDULA: ");
		cedula.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cedula, constraint);

		JTextField ced = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(ced, constraint);

		JLabel nombre = new JLabel("NOMBRE: ");
		nombre.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(nombre, constraint);

		JTextField nom = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(nom, constraint);

		JLabel apellido = new JLabel("APELLIDO: ");
		apellido.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(apellido, constraint);

		JTextField ape = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(ape, constraint);

		JLabel saldo = new JLabel("SALDO: ");
		saldo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(saldo, constraint);

		JTextField sald = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(sald, constraint);

		JLabel clave = new JLabel("CLAVE: ");
		clave.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 5;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(clave, constraint);

		JTextField cla = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 5;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cla, constraint);

		JButton aceptar = new JButton("ACEPTAR");
		aceptar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 7;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(aceptar, constraint);

		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int cedula = Integer.parseInt(ced.getText());
					String nombre = nom.getText();
					String apellido = ape.getText();
					int clave = Integer.parseInt(cla.getText());
					int saldo = Integer.parseInt(sald.getText());
					if (cedula == 0 || ced.equals("")) {
						JOptionPane.showMessageDialog(null, "Campo cedula vacio");
					} else if (nombre == null || nombre.equals("")) {
						JOptionPane.showMessageDialog(null, "Campo nombre vacio");
					} else if (apellido == null || apellido.equals("")) {
						JOptionPane.showMessageDialog(null, "Campo apellido vacio");
					} else if (clave == 0 || cla.equals("")) {
						JOptionPane.showMessageDialog(null, "Campo clave vacio");
					} else if (saldo == 0 || sald.equals("")) {
						JOptionPane.showMessageDialog(null, "Campo saldo vacio");
					} else if (clave<1000 || clave>9999) {
						JOptionPane.showMessageDialog(null, "La clave debe ser de 4 dígitos");
					} else if (saldo<50000) {
						JOptionPane.showMessageDialog(null, "El saldo debe ser de mínimo $50.000");
					} else {
						if (auxCed == 0) {
							Usuario us = new Usuario(cedula, nombre, apellido, clave, saldo);
							user.add(us);
							System.out.println(user);
							JOptionPane.showMessageDialog(null, "Usuario agregado", "Mensaje",
									JOptionPane.INFORMATION_MESSAGE);
							ced.setText("");
							nom.setText("");
							ape.setText("");
							cla.setText("");
							sald.setText("");
							for (int i = 0; i < PanelUser.user.size(); i++) {
								resulCedula = PanelUser.user.get(i).getCedula();
							}
							for (int i = 0; i < PanelUser.user.size(); i++) {
								resulSaldo = PanelUser.user.get(i).getSaldo();
							}
							for (int i = 0; i < PanelUser.user.size(); i++) {
								resulClave = PanelUser.user.get(i).getClave();
							}
							auxCed++;
						} else {
							if (resulCedula == cedula) {
								JOptionPane.showMessageDialog(null, "Cédula ya registrada, agregue otro usuario",
										"Error", JOptionPane.ERROR_MESSAGE);
							} else {
								Usuario us = new Usuario(cedula, nombre, apellido, clave, saldo);
								user.add(us);
								System.out.println(user);
								JOptionPane.showMessageDialog(null, "Usuario agregado", "Mensaje",
										JOptionPane.INFORMATION_MESSAGE);
								ced.setText("");
								nom.setText("");
								ape.setText("");
								cla.setText("");
								sald.setText("");
								for (int i = 0; i < PanelUser.user.size(); i++) {
									resulCedula = PanelUser.user.get(i).getCedula();
									System.out.println(resulCedula);
								}
								for (int i = 0; i < PanelUser.user.size(); i++) {
									resulSaldo = PanelUser.user.get(i).getSaldo();
									System.out.println(resulSaldo);
								}
								for (int i = 0; i < PanelUser.user.size(); i++) {
									resulClave = PanelUser.user.get(i).getClave();
									System.out.println(resulClave);
								}
							}
						}

						dispose();
					}
				} catch (NumberFormatException ed) {
					JOptionPane.showMessageDialog(null, "datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
	}
}
