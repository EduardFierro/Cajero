package CajeroUdec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.FocusManager;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import CajeroUdec.PanelTarjeta;
public class PanelTeclado extends JPanel{
	public static PanelFunciones panelFunciones;
	public static VentanaCajero ventanaCajero;
	public static PanelTransfers panelTransfer;
	public static PanelTarjeta panelTarjeta;
	public ArrayList<Character> numCed = new ArrayList<Character>();
	public char[] ced;
	String numero="";
	String cedul="";
	String cedul1="";
	
	public PanelTeclado() {
		this.setBackground(Color.LIGHT_GRAY);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		JButton uno = new JButton("1");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(uno, constraint);
		
		JButton dos = new JButton("2");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(dos, constraint);
		
		JButton tres = new JButton("3");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tres, constraint);
		
		JButton cuatro = new JButton("4");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cuatro, constraint);
		
		JButton cinco = new JButton("5");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cinco, constraint);
		
		JButton seis = new JButton("6");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(seis, constraint);
		
		JButton siete = new JButton("7");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(siete, constraint);
		
		JButton ocho = new JButton("8");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(ocho, constraint);
		
		JButton nueve = new JButton("9");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(nueve, constraint);
		
		JButton asterisco = new JButton("*");
		constraint = new GridBagConstraints();
		constraint.gridx = 0; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(asterisco, constraint);
		
		JButton cero = new JButton("0");
		constraint = new GridBagConstraints();
		constraint.gridx = 1; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cero, constraint);
		
		JButton numeral = new JButton("#");
		constraint = new GridBagConstraints();
		constraint.gridx = 2; 
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(numeral, constraint);
		
		JButton cancelar = new JButton("CANCELAR");
		cancelar.setBackground(java.awt.Color.red);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(cancelar, constraint);
		
		JButton limpiar = new JButton("LIMPIAR");
		limpiar.setBackground(java.awt.Color.yellow);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(limpiar, constraint);
		
		JButton salir = new JButton("SALIR");
		salir.setBackground(java.awt.Color.green);
		constraint = new GridBagConstraints();
		constraint.gridx = 3; 
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH; 
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(salir, constraint);
		
		uno.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
					numero ="1";
					cedul+=numero;
		        	PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
		        	panelTransfer.nCta.setText(String.valueOf(cedul1));
		
			}
			
		}
		);
		dos.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="2";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		tres.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="3";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		cuatro.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="4";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		cinco.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="5";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		seis.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="6";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		siete.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="7";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		ocho.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="8";
				cedul+=numero;
				panelTransfer.nCta.setText(String.valueOf(cedul));
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				
				
			}
			
		}
		);
		nueve.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="9";
				cedul+=numero;
				panelTransfer.nCta.setText(String.valueOf(cedul));
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				
				
			}
			
		}
		);
		cero.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numero ="0";
				cedul+=numero;
				
				PanelTarjeta.ntarjeta.setText(String.valueOf(cedul));
				panelTransfer.nCta.setText(String.valueOf(cedul));
				
			}
			
		}
		);
		limpiar.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cedul="";
				cedul1="";
				PanelTarjeta.ntarjeta.setText("");
				panelTransfer.nCta.setText("");
				
			}
			
		}
		);
		
		cancelar.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ventanaCajero.removeAll();
				ventanaCajero.add(panelFunciones,BorderLayout.CENTER);
				ventanaCajero.revalidate();
				ventanaCajero.repaint();
				
			}
			
		}
		);
	}
}

