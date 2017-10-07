package CajeroUdec;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelArriba extends JPanel{
	public PanelArriba() {
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("images/logocajero.jpg");

		imagen.setIcon(icono);
		imagen.setAlignmentX(CENTER_ALIGNMENT);
		add(imagen, BorderLayout.WEST);
	}

}
