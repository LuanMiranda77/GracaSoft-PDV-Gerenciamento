package VIEW;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import java.awt.Color;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.DropMode;
import javax.swing.JButton;


public class TelaLogin extends Principal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPasswordField txtSenha;
	private int a=500;
	private int l=400;
	private JTextField textNome;
	 private JLabel cadeado;
	 private 	JButton botLogar;
	 private 	int cont=0;

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		
		setTitle("Login");
		setBounds(100, 100, a, l);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		textNome = new JTextField();
		  textNome.setFont(new Font("Tahoma", Font.BOLD, 17));
		  textNome.setBounds(162, 171, 197, 27);
		  getContentPane().add(textNome);
		  textNome.setColumns(10);
		  textNome.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				public void keyReleased(KeyEvent e) {
					proximo(e);
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		txtSenha.setEchoChar('*');
		txtSenha.setColumns(10);
		txtSenha.setBackground(new Color(193,212,244));
		txtSenha.setToolTipText("senha");
		txtSenha.setBounds(164, 255, 195, 27);
		getContentPane().add(txtSenha);
		txtSenha.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyReleased(KeyEvent e) {
				proximo(e);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		 cadeado = new JLabel(new ImageIcon("icon/cadeadof.png"));
		  cadeado.setBounds(10, 141, 150, 150);
		  getContentPane().add(cadeado);
		
		botLogar = new JButton();
		botLogar.setIcon(new ImageIcon("icon/botLogin.png"));
		botLogar.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 15));
		botLogar.setBounds(162, 320, 200, 40);
		getContentPane().add(botLogar);
		botLogar.setOpaque(false);
		botLogar.setBorderPainted(false);
		botLogar.setBackground(new Color(1,1,1));
		
		 JLabel info = new JLabel(new ImageIcon("icon/info.png"));
		  info.setBounds(438, 300, 50, 50);
		  getContentPane().add(info);
		  info.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Digite seu usuario e senha para\n"+" acessar o sistema corretamente!", "Informação", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		 
		blackgroud();
		//super.blackgroud(a, l);
		setVisible(true);
		
		
		
		
		
		
		

	}


	  public void blackgroud() { 
	  JLabel contabil = new JLabel(new ImageIcon("icon/fundoLogin.jpg")); 
	  contabil.setBounds(0,0,500,400);
	  getContentPane().add(contabil); 
	  
	 
	  
	   }
	  public void proximo(java.awt.event.KeyEvent even) {
	      
		
			if(even.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
				if(cont==0) {
					txtSenha.requestFocus();
					cadeado.setIcon(new ImageIcon("icon/cadeadof.png"));
					cont=1;
				}
				else if(cont==1){
					cont=0;
					cadeado.setIcon(new ImageIcon("icon/cadeado.png"));
					botLogar.requestFocus();
					botLogar.addKeyListener(new KeyListener() {
						
						@Override
						public void keyTyped(KeyEvent e) {
							// TODO Auto-generated method stub
							
						}
						
						public void keyReleased(KeyEvent e) {
						
							
						}
						
						@Override
						public void keyPressed(KeyEvent e) {
							
							
							//dispose();
							//new Menu("");
							
						}
					});
				}
				
				
			}
	  }
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					  new TelaLogin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
