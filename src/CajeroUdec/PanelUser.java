package CajeroUdec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;



public class PanelUser extends JFrame{
	
	public static ArrayList<Usuario> user = new ArrayList();
	public PanelUser() {
		this("Registro Usuario");
	}

	public PanelUser(String titulo) {
		super(titulo);

		this.iniciar(); // Configurar mi JFRAME
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
				dispose();
				
				Usuario us = new Usuario(Integer.parseInt(ced.getText()),nom.getText(),ape.getText(),cla.getText(),Integer.parseInt(sald.getText()));
				user.add(us);
				
				System.out.println(user);
			}
		}
		);
	}
}
