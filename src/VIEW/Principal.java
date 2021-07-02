package VIEW;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Toolkit;


public class Principal extends JFrame {
	private int altura =450;
	private int largura=300;

	
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\icone.png"));
		setBackground(Color.DARK_GRAY);
		setResizable(false);
		setTitle("Principal");
		setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, altura, largura);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		//blackgroud(altura, largura);
		
		
		
	}
	public void blackgroud(int a,int l) {
		JLabel contabil = new JLabel(new ImageIcon("icon/fundo.jpg"));
		contabil.setBounds(1,1,a,l);
		add(contabil);
		
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}

	
}
