package CajeroUdec;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCentral1 extends JPanel{
	public PanelCentral1(){
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("images/bienvenidousuario.jpg");

		imagen.setIcon(icono);
		imagen.setAlignmentX(CENTER_ALIGNMENT);
		add(imagen, BorderLayout.WEST);
	}
}

