package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecho extends JPanel{
	public PanelDerecho() {
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JButton ok1 = new JButton("ok");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 10, 40, 10);
		constraint.insets = insets;
		add(ok1, constraint);
		
		JButton ok2 = new JButton("ok");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 10, 40, 10);
		constraint.insets = insets;
		add(ok2, constraint);
		
		JLabel spacewhite1 = new JLabel("          ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(spacewhite1, constraint);
		
		JLabel spacewhite2 = new JLabel("          ");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(spacewhite2, constraint);
		
		JLabel spacewhite3 = new JLabel("          ");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 10, 40, 10);
		constraint.insets = insets;
		add(spacewhite3, constraint);
	}
}

