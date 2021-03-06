package CajeroUdec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelClave extends JFrame{
	public static ConfirmSaldo panelConfirmacion;
	public static PanelUser panelUser;
	public static PanelPrincipal panelPrincipal;
	int contrAct, contrNue;
	public PanelClave() {
		this("Cambio de clave");
	}

	public PanelClave(String titulo) {
		super(titulo);

		this.iniciar(); 
		this.configurarPanelClave();

		this.pack();
		this.setVisible(true);
	}

	private PanelClave iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}
	private void configurarPanelClave() {
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
		
		JLabel conActual = new JLabel("Contraseņa actual: ");
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
		
		JLabel conNueva = new JLabel("Contraseņa nueva: ");
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
		
		JButton aceptar = new JButton("ACEPTAR");
		aceptar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar, constraint);
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					contrAct=Integer.parseInt(conAct.getText());
					contrNue=Integer.parseInt(conNue.getText());
					
		            if(contrAct==0 || conAct.equals("")){
		            	JOptionPane.showMessageDialog(null, "Campo  vacio");
		            }else if(contrNue==0 || conNue.equals("")){
		            	JOptionPane.showMessageDialog(null, "Campo  vacio");
			        }else {
			        	if(contrAct==panelUser.resulClave) {
							System.out.println("Clave correcta");
							panelUser.resulClave=contrNue;
							JOptionPane.showMessageDialog(null, "Clave modificada");
							System.out.println(panelUser.resulClave);
							dispose();
						}else {
							System.out.println("Clave actual incorrecta");
							JOptionPane.showMessageDialog(null, "Clave actual incorrecta");
							conAct.setText("");
							conNue.setText("");
						}
			        }
		        } catch (NumberFormatException ed) {
		            JOptionPane.showMessageDialog(null,"datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
				
				
				
				
			}
		});
	}
}
