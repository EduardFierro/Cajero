package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelTeclado extends JPanel{
	public PanelTeclado() {
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JButton uno = new JButton("1");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(uno, constraint);
		
		JButton dos = new JButton("2");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(dos, constraint);
		
		JButton tres = new JButton("3");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tres, constraint);
		
		JButton cuatro = new JButton("4");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cuatro, constraint);
		
		JButton cinco = new JButton("5");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cinco, constraint);
		
		JButton seis = new JButton("6");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(seis, constraint);
		
		JButton siete = new JButton("7");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(siete, constraint);
		
		JButton ocho = new JButton("8");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(ocho, constraint);
		
		JButton nueve = new JButton("9");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(nueve, constraint);
		
		JButton asterisco = new JButton("*");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(asterisco, constraint);
		
		JButton cero = new JButton("0");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cero, constraint);
		
		JButton numeral = new JButton("#");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(numeral, constraint);
		
		JButton cancelar = new JButton("CANCELAR");
		cancelar.setBackground(java.awt.Color.red);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cancelar, constraint);
		
		JButton limpiar = new JButton("LIMPIAR");
		limpiar.setBackground(java.awt.Color.yellow);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(limpiar, constraint);
		
		JButton salir = new JButton("SALIR");
		salir.setBackground(java.awt.Color.green);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(salir, constraint);
	}
}

