package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelClave extends JPanel{
	public static PanelConfirmacion panelConfirmacion;
	public static PanelUser panelUser;
	int contrAct, contrNue;
	int resulClave, claves;
	public PanelClave() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		
		JLabel titulo = new JLabel("Cambio de clave");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);
		
		JLabel spacewhite = new JLabel("                                                 ");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(spacewhite, constraint);
		
		JLabel conActual = new JLabel("Contrase�a actual: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(conActual, constraint);
		
		JPasswordField conAct = new JPasswordField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(conAct, constraint);
		
		JLabel conNueva = new JLabel("Contrase�a nueva: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(conNueva, constraint);
		
		JPasswordField conNue = new JPasswordField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(conNue, constraint);
		
		JButton continuar = new JButton("CONTINUAR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(continuar, constraint);
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contrAct=Integer.parseInt(conAct.getText());
				contrNue=Integer.parseInt(conNue.getText());
				claves=panelConfirmacion.claveconfirm;
				
				for (Usuario usuario : PanelUser.user) {
					Object[] clave = {usuario.getClave()};
					resulClave=(int) clave[0];
				}
				if(claves==resulClave) {
					JOptionPane.showMessageDialog(null, "Clave modificada");
					for (Usuario usuario : PanelUser.user) {
						Object[] clave = {usuario.getClave()};
						clave[0]=contrNue;
					}
					System.out.println(panelUser.user);
				}else {
					JOptionPane.showMessageDialog(null, "Clave actual incorrecta");
				}
				
				
			}
		});
	}
}