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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class PanelCT extends JFrame{
	public static PanelConsulta panelConsulta;
	public static PanelUser panelUser;
	public static JTextField clave;

	public PanelCT() {
		this("Confirmación clave");
	}

	public PanelCT(String titulo) {
		super(titulo);

		this.iniciar();
		this.configurarPanelConfirmacion();

		this.pack();
		this.setVisible(true);
	}

	private PanelCT iniciar() {
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

		JLabel titulo = new JLabel("Registro Transferencias");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);

		DefaultTableModel modelo1 = new DefaultTableModel();
		JTable tabla1 = new JTable(modelo1);
		tabla1.setBorder(new LineBorder(Color.black));
		constraint = new GridBagConstraints();
		constraint.gridx = 6;
		constraint.gridy = 5;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;

		Object[] object1 = { "ValorT", "Saldo" };

		for (Object columna1 : object1) {
			modelo1.addColumn(columna1);
		}
		tabla1.setVisible(false);
		add(tabla1, constraint);

		
			Object[] fila = { PanelUser.resulSaldo, PanelTransfers.valTrans };
			modelo1.addRow(fila);

		System.out.println(fila);
			
		JButton aceptar = new JButton("SALIR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar, constraint);
		
		JButton aceptar1 = new JButton("MOSTRAR");
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(aceptar1, constraint);
		
		
		aceptar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Object[] fila = { PanelUser.resulSaldo, PanelTransfers.valTrans };
				for(int i=0;i<ConfirmTrans.tran.size();i++) {
					modelo1.addRow(ConfirmTrans.tran);
				}
				
				tabla1.setVisible(true);
				//System.out.println(fila);

			}
		});
		
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();

			}
		});

	}
}
