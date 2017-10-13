package CajeroUdec;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPagos extends JPanel{
	public static PanelDinero panelDinero;
	public static PanelConfirmacion panelConfirmacion;
	public static int resulSaldo;
	String empresa;
	int referencia,valor;
	int resulClave, claves;
	public PanelPagos() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		
		JLabel titulo = new JLabel("Pagos");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);
		
		JLabel elegir = new JLabel("Empresas: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(elegir, constraint);
		
		JComboBox empresas = new JComboBox();
		empresas.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Claro","Movistar","Tigo-UNE","ETB","Virgin Mobile","Avantel","Móvil Éxito","Uff! Móvil","Codensa"}));
		empresas.setSelectedIndex(0);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(empresas, constraint);
		
		JLabel numRef = new JLabel("Número de referencia: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(numRef, constraint);
		
		JTextField nRef = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(nRef, constraint);
		
		JLabel valPag = new JLabel("Valor a pagar: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(valPag, constraint);
		
		JTextField vPag = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(vPag, constraint);
		
		JButton continuar = new JButton("CONTINUAR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(continuar, constraint);
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				empresa = (String) empresas.getSelectedItem();
				referencia=Integer.parseInt(nRef.getText());
				valor=Integer.parseInt(vPag.getText());
				for (Usuario usuario : PanelUser.user) {
					Object[] clave = {usuario.getClave()};
					resulClave=(int) clave[0];
				}
				if(claves==resulClave) {
					if(valor<=resulSaldo) {
						panelDinero.msjdinero.setText("Pago exitoso");
					}else {
						panelDinero.msjdinero.setText("Pago no realizado");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Clave incorrecta");
				}
			}
		});
	}
}
