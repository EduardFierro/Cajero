package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelRetiro extends JPanel{
	public PanelRetiro() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		
		JLabel titulo = new JLabel("Selecciona el monto a retirar");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);

		JLabel dinero600 = new JLabel("$600.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero600, constraint);
		
		JLabel dinero400 = new JLabel("$400.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero400, constraint);
		
		JLabel dinero200 = new JLabel("$200.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero200, constraint);
		
		JLabel dinero100 = new JLabel("$100.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero100, constraint);
		
		JLabel dinero50 = new JLabel("$50.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero50, constraint);
		
		JLabel dinero20 = new JLabel("$20.000");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(30, 50, 30, 50);
		constraint.insets = insets;
		add(dinero20, constraint);
	}
}
