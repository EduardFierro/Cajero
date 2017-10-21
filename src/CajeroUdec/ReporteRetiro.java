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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ReporteRetiro extends JFrame {
	PanelPrincipal panelPrincipal;
	public Object modelo;

	public ReporteRetiro() {
		this("Reporte Retiro");
	}

	public ReporteRetiro(String titulo) {
		super(titulo);

		this.iniciar();
		this.configurarReporteRetiro();

		this.pack();
		this.setVisible(true);
	}

	private ReporteRetiro iniciar() {
		Dimension dims = new Dimension(400, 350);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		return this;
	}

	private void configurarReporteRetiro() {

		this.setBackground(Color.white);
		setLayout(new GridBagLayout());
		GridBagConstraints constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		Insets insets = new Insets(40, 50, 40, 50);
		constraint.insets = insets;

		JLabel titulo = new JLabel("REPORTE RETIROS EFECTIVO:");
		titulo.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 0;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;
		add(titulo, constraint);

		DefaultTableModel modelo = new DefaultTableModel();
		JTable tabla = new JTable(modelo);
		tabla.setBorder(new LineBorder(Color.black));
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(8, 10, 8, 10);
		constraint.insets = insets;

		Object[] object = { "Valor Retiro", "Saldo" };

		for (Object columna1 : object) {
			modelo.addColumn(columna1);
		}
		add(tabla, constraint);

		JButton mostrar = new JButton("MOSTRAR");
		mostrar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(mostrar, constraint);

		JButton continuar = new JButton("SALIR");
		continuar.setForeground(Color.blue);
		constraint = new GridBagConstraints();
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(continuar, constraint);

		mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (Retiro retiro : PanelPrincipal.retiros) {
					Object[] fila = {retiro.getSaldo(), retiro.getValor() };
					modelo.addRow(fila);
				}
				
				tabla.setVisible(true);
				System.out.println(panelPrincipal.retiros);
			}
		});

		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
