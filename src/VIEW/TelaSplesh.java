


package VIEW;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;








public class TelaSplesh extends JWindow {
	private static String porc="10%";
	

	    /**
	 * @autor luan miranda
	 */
	private static final long serialVersionUID = 1L;
		private int duration;

	    public TelaSplesh(int d) {
	        duration = d;
	    }

	// Este � um m�todo simples para mostrar uma tela de apresent��o

	// no centro da tela durante a quantidade de tempo passada no construtor

	    public void showSplash() {        
	        JPanel content = (JPanel)getContentPane();
	        content.setBackground(Color.darkGray);

	        // Configura a posi��o e o tamanho da janela
	        int width = 600;
	        int height =420;
	        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        int x = (screen.width-width)/2;
	        int y = (screen.height-height)/2;
	        setBounds(x,y,width,height);

	        // Constr�i o splash screen
	        JLabel label = new JLabel(new ImageIcon("icon/g_animado.gif"));
	      
	        label.setBounds(2,150,150, 150);
	        JLabel load = new JLabel
	                (porc+"Carregando...");
	        load.setFont(new Font("Sans-Serif", Font.BOLD, 40));
	        load.setBounds(0,-50, 100, 250);
	        
	       content.add(label,BorderLayout.CENTER);
	     
	       // content.add(load);
	   
	        Color oraRed = new Color(20, 128, 128,  20);
	        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));        
	        // Torna vis�vel
	        setVisible(true);

	        // Espera ate que os recursos estejam carregados
	        
	        try { Thread.sleep(duration); } catch (Exception e) {}        
	        setVisible(false);
	    }

	    public void showTela() {  
	        showSplash();
	        
	    }

	    public static void main(String[] args) throws SQLException, ClassNotFoundException {        
	        // Mostra uma imagem com o t�tulo da aplica��o 
	    	
	     
	    	TelaSplesh splash = new TelaSplesh(4000);
	        splash.showTela();
	        new TelaLogin();

	       
			
				
	    }
}
