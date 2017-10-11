package CajeroUdec;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicial extends JPanel{
	public PanelInicial(){
		this.setBackground(Color.black);
		JLabel imagen = new JLabel();
		ImageIcon icono = new ImageIcon("images/bienvenidousuario.jpg");

		imagen.setIcon(icono);
		imagen.setAlignmentX(CENTER_ALIGNMENT);
		add(imagen, BorderLayout.WEST);
	}
}

