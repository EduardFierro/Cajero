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
import javax.swing.JTextField;

public class ConfirmSaldo extends JFrame{
	public static PanelConsulta panelConsulta;
	public static PanelUser panelUser;
	public static JTextField clave;
	public ConfirmSaldo() {
		this("Confirmación clave");
	}

	public ConfirmSaldo(String titulo) {
		super(titulo);

		this.iniciar(); // Configurar mi JFRAME
		this.configurarPanelConfirmacion();

		this.pack();
		this.setVisible(true);
	}

	private ConfirmSaldo iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}
	private void configurarPanelConfirmacion() {
		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;
		
		JLabel titulo = new JLabel("Digita tu clave, por favor");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);
		
		clave = new JTextField();
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(clave, constraint);
		
		JButton aceptar = new JButton("CONTINUAR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar, constraint);
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String confir=clave.getText();
	            if(confir==null ||confir.equals("")){
	            	JOptionPane.showMessageDialog(null, "Campo clave vacio");
		        }else {
		        	if(confir.equals(panelUser.resulClave)) {
		        		System.out.println("Clave correcta");
		        		PanelConsulta consul = new PanelConsulta();
		        		panelConsulta.saldo.setText("$"+String.valueOf(PanelUser.resulSaldo));
						System.out.println(PanelUser.resulSaldo);
		        		dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Clave incorrecta");
					}
		        	
	               	    
		        }
			}
		});
		
	}
	
}
