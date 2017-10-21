package CajeroUdec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel implements ActionListener {
	private JPanel panelInicial, panelRetiro, panelFunciones, panelTeclado, panelTarjeta, panelDinero;
	private JPanel panel, panelIzquierdo, panelCentro, panelDerecho, panelAbajo, panelArriba;
	public static JButton ok1_i, ok2_i, ok3_i, ok1_d, ok2_d, ok3_d;
	public static JTextField msjdinero;
	int ced, saldo, clave, flag = 0, aux = 0, exit = 0;
	public static int m=0;
	String ntarj, nom, ape;
	Array[] resul;
	Object[] cedula;
	JTextField ntarjeta;
	String numero = "";
	String cedul = "";

	public PanelPrincipal() {
		this.setBackground(Color.LIGHT_GRAY);
		panelInicial = new JPanel();
		panelRetiro = new JPanel();
		panelFunciones = new JPanel();
		panelTeclado = new JPanel();
		panelTarjeta = new JPanel();
		panelDinero = new JPanel();
		panel = new JPanel();
		panelIzquierdo = new JPanel();
		panelCentro = new JPanel();
		panelDerecho = new JPanel();
		panelAbajo = new JPanel();
		panelArriba = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new BorderLayout());
		add(panel);
		panelIzquierdo.setBackground(Color.LIGHT_GRAY);
		panelIzquierdo.setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		ok1_i = new JButton("ok1");
		ok1_i.addActionListener(this);
		ImageIcon icono = new ImageIcon("images/arrow-32-xxl.png");
		ok1_i.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelIzquierdo.add(ok1_i, constraint);

		ok2_i = new JButton("ok2");
		ok2_i.addActionListener(this);
		ok2_i.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelIzquierdo.add(ok2_i, constraint);

		ok3_i = new JButton("ok3");
		ok3_i.addActionListener(this);
		ok3_i.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelIzquierdo.add(ok3_i, constraint);

		JLabel spacewhite1 = new JLabel("                    ");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelIzquierdo.add(spacewhite1, constraint);

		panelDerecho.setBackground(Color.LIGHT_GRAY);
		panelDerecho.setLayout(new GridBagLayout());
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		ok1_d = new JButton("ok4");
		ok1_d.addActionListener(this);
		icono = new ImageIcon("images/arrow-32-xxl.png");
		ok1_d.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelDerecho.add(ok1_d, constraint);

		ok2_d = new JButton("ok5");
		ok2_d.addActionListener(this);
		ok2_d.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelDerecho.add(ok2_d, constraint);

		ok3_d = new JButton("ok6");
		ok3_d.addActionListener(this);
		ok3_d.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		panelDerecho.add(ok3_d, constraint);

		JLabel spacewhite2 = new JLabel("                    ");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelDerecho.add(spacewhite2, constraint);

		panelCentro.setBackground(Color.black);
		JLabel imagen = new JLabel();
		icono = new ImageIcon("images/bienvenidousuario.jpg");
		imagen.setIcon(icono);
		imagen.setAlignmentX(CENTER_ALIGNMENT);
		panelInicial.add(imagen, BorderLayout.CENTER);
		panelCentro.add(panelInicial, BorderLayout.CENTER);

		panelAbajo.setBackground(Color.LIGHT_GRAY);
		panelAbajo.setLayout(new BorderLayout());

		panelTarjeta.setBackground(Color.LIGHT_GRAY);
		panelTarjeta.setLayout(new GridBagLayout());
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JLabel tarjeta = new JLabel("Inserte tarjeta: (C.C)       ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTarjeta.add(tarjeta, constraint);

		ntarjeta = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		ntarjeta.requestFocus();
		panelTarjeta.add(ntarjeta, constraint);

		JButton ok = new JButton(">>");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTarjeta.add(ok, constraint);

		JButton agrusuario = new JButton("AGREGAR USUARIO");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTarjeta.add(agrusuario, constraint);

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ntarj = ntarjeta.getText();
				if (ntarj.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha ingresado número de tarjeta");
				} else {
					try {
						ced = Integer.parseInt(ntarjeta.getText());
					} catch (Exception p) {
						JOptionPane.showMessageDialog(null, "Número de tarjeta no válido");
						ntarj = "";
						cedul = "";
					} finally {

						if (!ntarj.isEmpty() && ced == PanelUser.resulCedula) {
							aux = Integer.parseInt(ntarjeta.getText());
							JOptionPane.showMessageDialog(null, "Tarjeta aceptada");
							JLabel imagen = new JLabel();
							ImageIcon icono = new ImageIcon("images/Funciones.jpg");
							imagen.setIcon(icono);
							imagen.setAlignmentX(CENTER_ALIGNMENT);
							panelFunciones.add(imagen, BorderLayout.CENTER);
							panelInicial.setVisible(false);
							panelRetiro.setVisible(false);
							panelFunciones.setVisible(true);
							panelCentro.add(panelFunciones, BorderLayout.CENTER);
							ntarj = "";
							cedul = "";
						} else {
							JOptionPane.showMessageDialog(null, "Tarjeta no encontrada");
							ntarj = "";
							cedul = "";
						}

					}
				}

			}

		});

		agrusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUser obj = new PanelUser();
			}
		});

		panelTeclado.setBackground(Color.LIGHT_GRAY);
		panelTeclado.setLayout(new GridBagLayout());
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JButton uno = new JButton("1");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(uno, constraint);

		JButton dos = new JButton("2");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(dos, constraint);

		JButton tres = new JButton("3");
		constraint = new GridBagConstraints();
		constraint.gridx = 2;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(tres, constraint);

		JButton cuatro = new JButton("4");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(cuatro, constraint);

		JButton cinco = new JButton("5");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(cinco, constraint);

		JButton seis = new JButton("6");
		constraint = new GridBagConstraints();
		constraint.gridx = 2;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(seis, constraint);

		JButton siete = new JButton("7");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(siete, constraint);

		JButton ocho = new JButton("8");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(ocho, constraint);

		JButton nueve = new JButton("9");
		constraint = new GridBagConstraints();
		constraint.gridx = 2;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(nueve, constraint);

		JButton asterisco = new JButton("*");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(asterisco, constraint);

		JButton cero = new JButton("0");
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(cero, constraint);

		JButton numeral = new JButton("#");
		constraint = new GridBagConstraints();
		constraint.gridx = 2;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(numeral, constraint);

		JButton cancelar = new JButton("CANCELAR");
		cancelar.setBackground(java.awt.Color.red);
		constraint = new GridBagConstraints();
		constraint.gridx = 3;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(cancelar, constraint);

		JButton limpiar = new JButton("LIMPIAR");
		limpiar.setBackground(java.awt.Color.yellow);
		constraint = new GridBagConstraints();
		constraint.gridx = 3;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(limpiar, constraint);

		JButton salir = new JButton("SALIR");
		salir.setBackground(java.awt.Color.green);
		constraint = new GridBagConstraints();
		constraint.gridx = 3;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelTeclado.add(salir, constraint);

		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "1";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "2";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "3";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "4";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));
			}

		});
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "5";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "6";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "7";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "8";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "9";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = "0";
				cedul += numero;
				ntarjeta.setText(String.valueOf(cedul));

			}

		});
		limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cedul = "";
				ntarjeta.setText("");
				msjdinero.setText("");
			}

		});

		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					flag = 0;
					JLabel imagen = new JLabel();
					ImageIcon icono = new ImageIcon("images/Funciones.jpg");
					imagen.setIcon(icono);
					imagen.setAlignmentX(CENTER_ALIGNMENT);
					panelFunciones.add(imagen, BorderLayout.CENTER);
					panelCentro.add(panelFunciones, BorderLayout.CENTER);
					panelInicial.setVisible(false);
					panel.remove(panelInicial);
					panelInicial.removeAll();
					panelRetiro.setVisible(false);
					panel.remove(panelRetiro);
					panelRetiro.removeAll();
					panelFunciones.setVisible(true);
				}

			}

		});
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PanelUser.user.size() == 0 || aux == 0) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					exit = 1;
					panelFunciones.setVisible(false);
					panel.remove(panelFunciones);
					panelFunciones.removeAll();
					panelRetiro.setVisible(false);
					panel.remove(panelRetiro);
					panelRetiro.removeAll();
					panelInicial.repaint();
					panelInicial.setVisible(true);
					msjdinero.setText(null);
					cedul = "";
					ntarjeta.setText("");
					msjdinero.setText("");
				}
			}

		});

		panelDinero.setBackground(Color.LIGHT_GRAY);
		panelDinero.setLayout(new GridBagLayout());
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JLabel dinero = new JLabel("Retire su dinero:                                                  ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelDinero.add(dinero, constraint);

		msjdinero = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		panelDinero.add(msjdinero, constraint);

		panelArriba.setBackground(Color.LIGHT_GRAY);
		JLabel logo = new JLabel();
		ImageIcon iconologo = new ImageIcon("images/logocajero.jpg");

		logo.setIcon(iconologo);
		logo.setAlignmentX(CENTER_ALIGNMENT);
		panelArriba.add(logo);

		panelAbajo.add(panelTeclado, BorderLayout.NORTH);
		panelAbajo.add(panelDinero, BorderLayout.WEST);
		panelAbajo.add(panelTarjeta, BorderLayout.EAST);

		panel.add(panelIzquierdo, BorderLayout.WEST);
		panel.add(panelCentro, BorderLayout.CENTER);
		panel.add(panelDerecho, BorderLayout.EAST);
		panel.add(panelAbajo, BorderLayout.SOUTH);
		panel.add(panelArriba, BorderLayout.NORTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (flag == 0) {
			switch (e.getActionCommand()) {
			case "ok1":
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					System.out.println("---RETIRO EN EFECTIVO---");
					flag++;
					JLabel dinero = new JLabel();
					ImageIcon icono3 = new ImageIcon("images/Dinero.jpg");
					dinero.setIcon(icono3);
					dinero.setAlignmentX(CENTER_ALIGNMENT);
					panelRetiro.add(dinero, BorderLayout.CENTER);
					panelFunciones.setVisible(false);
					panel.remove(panelFunciones);
					panelFunciones.removeAll();
					panel.remove(panelInicial);
					panelInicial.removeAll();
					panelInicial.setVisible(false);
					panelRetiro.setVisible(true);
					panelCentro.add(panelRetiro, BorderLayout.CENTER);

				}

				break;

			case "ok2":
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					System.out.println("---CONSULTA SALDO---");
					ConfirmSaldo saldo = new ConfirmSaldo();
				}

				break;

			case "ok3":
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					System.out.println("---TRANSFERENCIAS---");
					PanelTransfers trans = new PanelTransfers();
				}

				break;

			case "ok4":
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					System.out.println("---PAGOS---");
					PanelPagos pag = new PanelPagos();
				}

				break;

			case "ok5":
				if (PanelUser.user.size() == 0 || aux == 0 || exit == 1) {
					JOptionPane.showMessageDialog(null, "Agregue un usuario / inserte tarjeta");
				} else {
					System.out.println("---CAMBIO DE CLAVE---");
					PanelClave cla = new PanelClave();
				}

				break;

			}
		} else {
			switch (e.getActionCommand()) {
			case "ok1":
	
				flag = 0;
				System.out.println("$600.000");
				if (PanelUser.resulSaldo >= 602000) {
					ConfirmRetiro o = new ConfirmRetiro();
					PanelUser.resulSaldo = PanelUser.resulSaldo - 600000;
					
					System.out.println("Descuento exitoso");
					
				} else {
					JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("No hay saldo suficiente");
				}
				panel.remove(panelRetiro);
				panelRetiro.removeAll();
				panelRetiro.setVisible(false);
				JLabel imagen = new JLabel();
				ImageIcon icono = new ImageIcon("images/Funciones.jpg");
				imagen.setIcon(icono);
				imagen.setAlignmentX(CENTER_ALIGNMENT);
				panelFunciones.add(imagen, BorderLayout.CENTER);
				panelCentro.add(panelFunciones, BorderLayout.CENTER);
				panelFunciones.setVisible(true);
				break;

			case "ok2":
				flag = 0;
				System.out.println("$400.000");
				if (PanelUser.resulSaldo >= 402000) {
					ConfirmRetiro o = new ConfirmRetiro();
					PanelUser.resulSaldo = PanelUser.resulSaldo - 400000;
					
					System.out.println("Descuento exitoso");
					
				} else {
					JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("No hay saldo suficiente");
				}
				panel.remove(panelRetiro);
				panelRetiro.removeAll();
				panelRetiro.setVisible(false);
				imagen = new JLabel();
				icono = new ImageIcon("images/Funciones.jpg");
				imagen.setIcon(icono);
				imagen.setAlignmentX(CENTER_ALIGNMENT);
				panelFunciones.add(imagen, BorderLayout.CENTER);
				panelCentro.add(panelFunciones, BorderLayout.CENTER);
				panelFunciones.setVisible(true);
				break;

			case "ok3":
				flag = 0;
				System.out.println("$200.000");
				if (PanelUser.resulSaldo >= 202000) {
					ConfirmRetiro o = new ConfirmRetiro();
					PanelUser.resulSaldo = PanelUser.resulSaldo - 200000;
					
					System.out.println("Descuento exitoso");
					
				} else {
					JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("No hay saldo suficiente");
				}
				panel.remove(panelRetiro);
				panelRetiro.removeAll();
				panelRetiro.setVisible(false);
				imagen = new JLabel();
				icono = new ImageIcon("images/Funciones.jpg");
				imagen.setIcon(icono);
				imagen.setAlignmentX(CENTER_ALIGNMENT);
				panelFunciones.add(imagen, BorderLayout.CENTER);
				panelCentro.add(panelFunciones, BorderLayout.CENTER);
				panelFunciones.setVisible(true);
				break;

			case "ok4":
				flag = 0;
				System.out.println("$500.000");
				if (PanelUser.resulSaldo >= 502000) {
					ConfirmRetiro o = new ConfirmRetiro();
					PanelUser.resulSaldo = PanelUser.resulSaldo - 500000;
					
					System.out.println("Descuento exitoso");
				
				} else {
					JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("No hay saldo suficiente");
				}
				panel.remove(panelRetiro);
				panelRetiro.removeAll();
				panelRetiro.setVisible(false);
				imagen = new JLabel();
				icono = new ImageIcon("images/Funciones.jpg");
				imagen.setIcon(icono);
				imagen.setAlignmentX(CENTER_ALIGNMENT);
				panelFunciones.add(imagen, BorderLayout.CENTER);
				panelCentro.add(panelFunciones, BorderLayout.CENTER);
				panelFunciones.setVisible(true);
				break;

			case "ok5":
				flag = 0;
				System.out.println("$50.000");
				if (PanelUser.resulSaldo >= 52000) {
					ConfirmRetiro o = new ConfirmRetiro();
					PanelUser.resulSaldo = PanelUser.resulSaldo - 50000;
					System.out.println("Descuento exitoso");
				} else {
					JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE);
					System.out.println("No hay saldo suficiente");
				}
				panel.remove(panelRetiro);
				panelRetiro.removeAll();
				panelRetiro.setVisible(false);
				imagen = new JLabel();
				icono = new ImageIcon("images/Funciones.jpg");
				imagen.setIcon(icono);
				imagen.setAlignmentX(CENTER_ALIGNMENT);
				panelFunciones.add(imagen, BorderLayout.CENTER);
				panelCentro.add(panelFunciones, BorderLayout.CENTER);
				panelFunciones.setVisible(true);
				break;

			case "ok6":
				flag = 0;
				System.out.println("$20.000");
					if (PanelUser.resulSaldo >= 22000) {
						ConfirmRetiro o = new ConfirmRetiro();
						PanelUser.resulSaldo = PanelUser.resulSaldo - 20000;
						System.out.println("Descuento exitoso");
						
					} else {
						JOptionPane.showMessageDialog(null, "No hay saldo suficiente", "Mensaje",
								JOptionPane.INFORMATION_MESSAGE);
						System.out.println("No hay saldo suficiente");
					}
					panel.remove(panelRetiro);
					panelRetiro.removeAll();
					panelRetiro.setVisible(false);
					imagen = new JLabel();
					icono = new ImageIcon("images/Funciones.jpg");
					imagen.setIcon(icono);
					imagen.setAlignmentX(CENTER_ALIGNMENT);
					panelFunciones.add(imagen, BorderLayout.CENTER);
					panelCentro.add(panelFunciones, BorderLayout.CENTER);
					panelFunciones.setVisible(true);
				
				
				
				break;
			}
		}

	}

}
