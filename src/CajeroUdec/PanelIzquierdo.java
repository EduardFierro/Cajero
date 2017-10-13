package CajeroUdec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelIzquierdo extends JPanel {
	public static VentanaCajero ventanaCajero;
	public static PanelRetiro panelRetiro;
	public static JButton ok1, ok2, ok3;
	public static int resulSaldo;
	public static PanelConsulta panelConsulta;
	public static PanelTransfers panelTransfers;

	public PanelIzquierdo() {
		this.setBackground(Color.LIGHT_GRAY);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		ok1 = new JButton();
		ImageIcon icono = new ImageIcon("images/arrow-32-xxl.png");
		ok1.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok1, constraint);

		ok2 = new JButton();
		ok2.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok2, constraint);

		ok3 = new JButton();
		ok3.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok3, constraint);

		JLabel spacewhite1 = new JLabel("          ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(spacewhite1, constraint);

		/*
		 * JLabel spacewhite2 = new JLabel("          "); constraint = new
		 * GridBagConstraints(); constraint.gridx = 2; constraint.gridy = 1;
		 * constraint.fill = GridBagConstraints.BOTH; insets = new Insets(5, 10, 5, 10);
		 * constraint.insets = insets; add(spacewhite2, constraint);
		 */

		ok1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		ok2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		ok3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

	}
}
