package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class TelaTroco extends Principal {

	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private static DecimalFormat convert= new DecimalFormat("#,##0.00");
	private JLabel titulo;
	private static JLabel  totalVenda;
	private int y,x;
	private JTextField txtDescP;
	private JTextField txtDescV;
	private JTextField pago;
	private JTextField troco;
	private JButton botOk;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//new TelaTroco();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaTroco(JFrame tela) {
		pegarResolucao();
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(true);
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setTitle("Pagamento Cartao");
		setLocationRelativeTo(null);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(java.awt.Window.Type.UTILITY);//nao minimizar
		
	    componentes(tela);
	    fundo();
		setVisible(true);
		repaint();
	}
	



	
	public void pegarResolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width -500), (dimensao.height - 300));
         y= (dimensao.width-500);
         x=(dimensao.height-300);
	}
	public void fundo() {
		
		
		  ///fundo da tela
		JLabel logo = new JLabel(new ImageIcon("icon/logoPequenaPP.png"));
		logo.setText("");
		logo.setBounds(650,250,150,150);
		getContentPane().add(logo);
		
		JLabel fundo = new JLabel(new ImageIcon("icon/fundoGeral.jpg"));
		fundo.setText("");
		fundo.setBounds(0,0,866,468);
		getContentPane().add(fundo);
		
		
	}
	public static void setTotalVenda(double valor) {
	    
		totalVenda.setText(convert.format(valor));
		//txtCartao.setText(valor);
	}
public void componentes(JFrame tela) {
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		totalVenda = new JLabel("10,00");
		totalVenda.setBackground(Color.RED);
		totalVenda.setForeground(Color.WHITE);
		totalVenda.setOpaque(true);
		totalVenda.setHorizontalAlignment(SwingConstants.CENTER);
		totalVenda.setFont(new Font("Tahoma", Font.BOLD, 40));
		totalVenda.setBorder(new TitledBorder(null, "Total da Venda", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 255, 255)));
		totalVenda.setBounds(608, 64, 242, 88);
		getContentPane().add(totalVenda);
		
		titulo = new JLabel("Pagamento com troco\r\n");
		titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		titulo.setForeground(Color.GRAY);
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0, 0, 660, 55);
		
		getContentPane().add(titulo);
		
		txtDescP = new JTextField();
		txtDescP.setBounds(51, 91, 242, 61);
		txtDescP.setBorder(new TitledBorder(null, "DESCONTO EM %", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 200, 0)));
		txtDescP.setForeground(Color.WHITE);
		txtDescP.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtDescP.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtDescP.setCaretColor(Color.WHITE);
		txtDescP.setBackground(Color.DARK_GRAY);
		contentPane.add(txtDescP);
		txtDescP.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(txtDescP.getText().equals("")) {
						txtDescV.requestFocus();
					}
					else {	
				txtDescP.setText(txtDescP.getText().replace(",","."));
				totalVenda.setText(totalVenda.getText().replace(",","."));
				totalVenda.setText(convert.format(ComandText.porcentagem(txtDescP,totalVenda)));
				txtDescV.requestFocus();
				}
				}
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					dispose();
				}
				
			}
				
		});
		
		txtDescV = new JTextField();
		txtDescV.setBackground(Color.DARK_GRAY);
		txtDescV.setOpaque(false);
		txtDescV.setColumns(10);
		txtDescV.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DESCONTO EM VALOR", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 200, 0)));
		txtDescV.setBounds(303, 91, 242, 61);
		txtDescV.setForeground(Color.WHITE);
		txtDescV.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtDescV.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtDescV.setCaretColor(Color.WHITE);
		txtDescV.setOpaque(false);
		contentPane.add(txtDescV);
		txtDescV.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(txtDescV.getText().equals("")) {
						pago.requestFocus();
					}
				else {	
					txtDescV.setText(txtDescV.getText().replace(",","."));
					totalVenda.setText(totalVenda.getText().replace(",","."));
					totalVenda.setText(convert.format(ComandText.diminuir(totalVenda,txtDescV)));
					pago.requestFocus();
				}
				}
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					dispose();
				}
				
			}
				

		});
		
		
		pago = new JTextField();
		pago.setBackground(Color.DARK_GRAY);
		//pago.setOpaque(false);
		pago.setColumns(10);
		pago.setBorder(new TitledBorder(null, "TOTAL PAGO PELO CLIENTE", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 200, 0)));
		pago.setBounds(126, 195, 315, 61);
		pago.setForeground(Color.WHITE);
		pago.setFont(new Font("Tahoma", Font.PLAIN, 23));
		pago.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		pago.setCaretColor(Color.WHITE);
		pago.setOpaque(false);
		contentPane.add(pago);
		pago.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode()==KeyEvent.VK_ENTER) {
							if(pago.getText().equals("")) {
								troco.requestFocus();
							}
						else {	
							pago.setText(pago.getText().replace(",","."));
							totalVenda.setText(totalVenda.getText().replace(",","."));
							troco.setText(convert.format(ComandText.troco(totalVenda,pago)));
							troco.requestFocus();
						}
						}
						if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
							dispose();
						}
						
						
						
					}
				});
		
		troco = new JTextField();
		troco.setBackground(Color.DARK_GRAY);
		troco.setOpaque(false);
		troco.setColumns(10);
		troco.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TROCO DO CLIENTE", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 200, 0)));
		troco.setBounds(131, 275, 315, 61);
		troco.setForeground(Color.WHITE);
		troco.setFont(new Font("Tahoma", Font.PLAIN, 23));
		troco.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		troco.setCaretColor(Color.WHITE);
		troco.setOpaque(false);
		contentPane.add(troco);
		troco.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
							dispose();
						}
						dispose();
						tela.dispose();
						new TelaPDV();
				
						
					}
				});
		
		
		botOk = new JButton("ENTER-OK");
		botOk.setBounds(126, 392, 124, 36);
		getContentPane().add(botOk);
		
		JButton btnCancelar = new JButton("<HTML>ESC-CANCELA<HTML>");
		btnCancelar.setBounds(267, 392, 124, 36);
		getContentPane().add(btnCancelar);
	}

}
