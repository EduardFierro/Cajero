package CajeroUdec;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPagos extends JFrame{
	public static ConfirmSaldo panelConfirmacion;
	String empresa;
	public static int referencia,valor;
	public PanelPagos() {
		this("Pagos");
	}

	public PanelPagos(String titulo) {
		super(titulo);

		this.iniciar(); 
		this.configurarPanelPagos();

		this.pack();
		this.setVisible(true);
	}

	private PanelPagos iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}
	private void configurarPanelPagos() {
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
		empresas.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Claro","Movistar","Tigo-UNE","ETB","Virgin Mobile","Avantel","M�vil �xito","Uff! M�vil","Codensa"}));
		empresas.setSelectedIndex(0);
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(empresas, constraint);
		
		JLabel numRef = new JLabel("N�mero de referencia: ");
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
		continuar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(continuar, constraint);
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					empresa = (String) empresas.getSelectedItem();
					referencia=Integer.parseInt(nRef.getText());
					valor=Integer.parseInt(vPag.getText());
		            if(empresa=="Seleccionar" || empresas.equals("Seleccionar")){
		            	JOptionPane.showMessageDialog(null, "Seleccione una empresa");
		            }else if(referencia==0 || nRef.equals("")){
		            	JOptionPane.showMessageDialog(null, "Campo referencia vacio");
		            }else if(valor==0 ||vPag.equals("")) {
		            	JOptionPane.showMessageDialog(null, "Campo valor vacio");
			        }else {
			        	System.out.println("Clave por confirmar para pago");
						ConfirmPag confir = new ConfirmPag();
						confir.setVisible(true);
		               	dispose();    
			        }
		        } catch (NumberFormatException ed) {
		            JOptionPane.showMessageDialog(null,"datos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
				
				
				
			}
		});
	}
}
