package CajeroUdec;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

import javax.swing.FocusManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CajeroUdec.PanelUser;


public class PanelTarjeta extends JPanel {
	
	int ced,saldo,clave;
	String ntarj;
	Array[] resul;
	Object [] cedula;
	String  nom, ape;
	PanelUser panelUser;
	public static JTextField ntarjeta;
	public PanelTarjeta() {
		this.setBackground(Color.LIGHT_GRAY);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JLabel tarjeta = new JLabel("Inserte tarjeta: (C.C)       ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tarjeta, constraint);

		ntarjeta = new JTextField("");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		ntarjeta.requestFocus();
		add(ntarjeta, constraint);

		JButton ok = new JButton(">>");
		/*ImageIcon icono = new ImageIcon("images/Flecha apuntando.gif");
		ok.setIcon(icono);*/
		constraint = new GridBagConstraints();
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(ok, constraint);

		JButton agrusuario = new JButton("AGREGAR USUARIO");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(agrusuario, constraint);
		

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ntarj=ntarjeta.getText();
				System.out.println(PanelUser.user);
				for (Usuario usuario : PanelUser.user) {
					Object[] cedula = {usuario.getCedula(),usuario.getNombre(),usuario.getApellido(),usuario.getSaldo(),usuario.getClave()};
					//resul =(Array[]) cedula;
				}
				if(ntarj.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No ha ingresado número de tarjeta");
				}else {
					try {
					ced=Integer.parseInt(ntarjeta.getText());
					}catch(Exception p) {
						JOptionPane.showMessageDialog(null, "Número de tarjeta no válido");
						ntarj="";
						ntarjeta.setText("");
					}finally {
						
							if(!ntarj.isEmpty()  ) {
								JOptionPane.showMessageDialog(null, "Tarjeta aceptada");
							}else {
								JOptionPane.showMessageDialog(null, "Tarjeta no encontrada");
							}
		
						
					}
				}
				
			}
			
		});
		
		agrusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUser obj = new PanelUser();
			}
		}
		);
	}

}
