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

public class PanelCentro extends JPanel implements ActionListener {
	private JPanel panelInicial, panelRetiro, panelDinero, panelFunciones;
	private JPanel panel, panelIzquierdo, panelCentro, panelDerecho;
	public static JButton ok1_i, ok2_i, ok3_i, ok1_d, ok2_d, ok3_d;

	public PanelCentro() {
		this.setBackground(Color.LIGHT_GRAY);
		panelInicial = new JPanel();
		panelRetiro = new JPanel();
		panelDinero = new JPanel();
		panelFunciones = new JPanel();
		panel = new JPanel();
		panelIzquierdo = new JPanel();
		panelCentro = new JPanel();
		panelDerecho = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
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
		panelCentro.add(panelInicial,BorderLayout.CENTER);

		panel.add(panelIzquierdo, BorderLayout.EAST);
		panel.add(panelCentro, BorderLayout.CENTER);
		panel.add(panelDerecho, BorderLayout.WEST);
	}
	
	/*public void panelFunciones() {
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("images/Funciones.jpg");
		imagen.setIcon(icono);
		imagen.setAlignmentX(CENTER_ALIGNMENT);
		panelFunciones.add(imagen, BorderLayout.CENTER);
		panelInicial.setVisible(false);
		panelCentro.add(panelFunciones,BorderLayout.CENTER);
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ok1":
			System.out.println("---RETIRO EN EFECTIVO---");
			JLabel dinero = new JLabel( );
	        ImageIcon icono3 = new ImageIcon("images/Dinero.jpg");
	        dinero.setIcon( icono3 );
	        dinero.setAlignmentX(CENTER_ALIGNMENT);
	        panelRetiro.add(dinero, BorderLayout.CENTER);
	        
	        panelInicial.setVisible(false);
	        panelCentro.add(panelRetiro,BorderLayout.CENTER);
			break;

		case "ok2":
			System.out.println("---CONSULTA SALDO---");
			PanelConsulta consul = new PanelConsulta();
			break;

		case "ok3":
			System.out.println("---TRANSFERENCIAS---");
			PanelTransfers trans = new PanelTransfers();
			break;

		case "ok4":
			System.out.println("---PAGOS---");
			PanelPagos pag = new PanelPagos();
			break;

		case "ok5":
			System.out.println("---CAMBIO DE CLAVE---");
			PanelClave cla = new PanelClave();
			break;

		case "ok6":

			break;
		}

	}

}
