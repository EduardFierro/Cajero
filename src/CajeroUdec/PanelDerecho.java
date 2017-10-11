package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelDerecho extends JPanel{
	public PanelDerecho() {
		this.setBackground(Color.LIGHT_GRAY);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JButton ok1 = new JButton();
		ImageIcon icono = new ImageIcon("images/arrow-32-xxl.png");
		ok1.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok1, constraint);
		
		JButton ok2 = new JButton();
		ok2.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok2, constraint);
		
		JButton ok3 = new JButton();
		ok3.setIcon(icono);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(20, 10, 20, 10);
		constraint.insets = insets;
		add(ok3, constraint);
		
		/*JLabel spacewhite1 = new JLabel("          ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(spacewhite1, constraint);*/
		
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
		insets = new Insets(30, 10, 30, 10);
		constraint.insets = insets;
		add(spacewhite3, constraint);
	}
}

