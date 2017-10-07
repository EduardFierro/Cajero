package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelCentral2 extends JPanel{
	

	
	public PanelCentral2() {
		Border blackline;
		blackline = BorderFactory.createLineBorder(Color.black);
		setLayout(new GridBagLayout());
		this.setBorder(blackline);
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;

		JLabel efectivo = new JLabel("   RETIRO EN EFECTIVO   ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		Border border = BorderFactory.createLineBorder(Color.gray, 2);
		efectivo.setBorder(border);
		add(efectivo, constraint);
		
		JLabel pagos = new JLabel("               PAGOS      ");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		pagos.setBorder(border);
		add(pagos, constraint);
		
		JLabel saldo = new JLabel("    CONSULTA SALDO   ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		saldo.setBorder(border);
		add(saldo, constraint);
		
		JLabel clave = new JLabel("    CAMBIO DE CLAVE    ");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		clave.setBorder(border);
		add(clave, constraint);
		
		JLabel transferencias = new JLabel("     TRANSFERENCIAS   ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		transferencias.setBorder(border);
		add(transferencias, constraint);
	}
}

