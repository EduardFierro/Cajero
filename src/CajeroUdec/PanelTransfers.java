package CajeroUdec;

import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTransfers extends JFrame{
	public static int valTrans;
	public static JTextField val;
	public static JTextField nCta; 
	public static PanelUser panelUser;
	public static PanelPrincipal panelPrincipal;
	public static ConfirmSaldo panelConfirmacion;
	public static int resulSaldo;
	int resulClave, claves;
	String nombreTrans;
	int numCuenta;
	public PanelTransfers(){
		this("Transferencias");
	}

	public PanelTransfers(String titulo) {
		super(titulo);

		this.iniciar(); // Configurar mi JFRAME
		this.configurarPanelTransfers();

		this.pack();
		this.setVisible(true);
	}

	private PanelTransfers iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}
	private void configurarPanelTransfers() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		
		JLabel titulo = new JLabel("Transferencias");
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
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(spacewhite, constraint);
		
		JLabel nombre = new JLabel("Nombre: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(nombre, constraint);
		
		JTextField nom = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(nom, constraint);
		
		JLabel numCta = new JLabel("Número de cuenta: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(numCta, constraint);
		
		nCta = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(nCta, constraint);
		
		JLabel valor = new JLabel("Valor a transferir: ");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(valor, constraint);
		
		val = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(val, constraint);
		
		JButton aceptar = new JButton("CONTINUAR");
		aceptar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar, constraint);
		

		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println("Confirmar clave para transferencia");
				
				try {
					nombreTrans=nom.getText();
					numCuenta=Integer.parseInt(nCta.getText());
					valTrans=Integer.parseInt(val.getText());

		           
		            if(nombreTrans==null || nombreTrans.equals("")){
		            	JOptionPane.showMessageDialog(null, "Campo nombre vacio");
		            }else if(numCuenta==0 || nCta.equals("")){
		            	JOptionPane.showMessageDialog(null, "Campo numero vacio");
		            }else if(valTrans==0 ||val.equals("")) {
		            	JOptionPane.showMessageDialog(null, "Campo apellido vacio");
			        }else {
			        	for (Usuario usuario : PanelUser.user) {
							Object[] clave = {usuario.getClave()};
							resulClave=(int) clave[0];
						}
						if(claves==resulClave) {
							if(valTrans<=resulSaldo) {
								panelPrincipal.msjdinero.setText("Transferencia exitosa");
							}else {
								panelPrincipal.msjdinero.setText("Transferencia no realizada");
							}
						}else {
							JOptionPane.showMessageDialog(null, "Clave incorrecta");
						}
						ConfirmTrans confir = new ConfirmTrans();
		               	dispose();    
			        }
		        } catch (NumberFormatException ed) {
		            JOptionPane.showMessageDialog(null,"datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
				
				
			}
		});
	}
	

}
