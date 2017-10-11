package CajeroUdec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelAbajo extends JPanel{
	PanelTeclado panelTeclado;
	PanelDinero panelDinero;
	PanelTarjeta panelTarjeta;
	public PanelAbajo() {
		this.setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		panelTeclado = new PanelTeclado();
		add(panelTeclado, BorderLayout.NORTH);
		panelDinero = new PanelDinero();
		add(panelDinero, BorderLayout.WEST);
		panelTarjeta = new PanelTarjeta();
		add(panelTarjeta, BorderLayout.EAST);
	}
}

