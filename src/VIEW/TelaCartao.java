package VIEW;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaCartao extends Principal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtDinheiro;
	private static JTextField txtCartao;
	private JTextField txtCartao2;
	private static DecimalFormat convert= new DecimalFormat("#,##0.00");
	private JLabel lblNewLabel;
	private static JLabel  totalVenda;
	private String [] tipo = {"CREDITO","DEBITO"};
	private Object res;


	public TelaCartao(JFrame tela) {
		getContentPane().setBackground(Color.DARK_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon/produtoFundo.jpg"));
		pegarResolucao();
		setTitle("Pagamento Cartao");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(java.awt.Window.Type.UTILITY);//nao minimizar
	    componentes(tela);
		setVisible(true);
		repaint();
		
	}
	
	public void pegarResolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width -700), (dimensao.height - 400));
		
	}
	public void tipoCartao() {
		res =JOptionPane.showInputDialog(null, "QUAL O TIPO DO CARTÃO?", "CARTÃO", JOptionPane.QUESTION_MESSAGE, null, tipo,tipo[0]);
	}
	public static void setTotalVenda(double valor) {
	    
		totalVenda.setText(convert.format(valor));
		//txtCartao.setText(valor);
	}
public void componentes(JFrame tela) {
		
		txtDinheiro = new JFormattedTextField(convert);
		txtDinheiro.setBackground(Color.DARK_GRAY);
		txtDinheiro.setForeground(Color.WHITE);
		txtDinheiro.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtDinheiro.setBorder(new TitledBorder(null, "Dinheiro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		txtDinheiro.setBounds(20, 115, 252, 56);
		txtDinheiro.setCaretColor(Color.WHITE);
		getContentPane().add(txtDinheiro);
		txtDinheiro.addKeyListener(new KeyListener() {
			
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
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
					if(!txtDinheiro.getText().equals("")) {
						totalVenda.setText(totalVenda.getText().replace(",","."));
						totalVenda.setText(convert.format(ComandText.diminuir(totalVenda, txtDinheiro)));
						txtCartao.requestFocus();
						//txtCartao.setText(totalVenda.getText());
						
					}
					else {
						txtCartao.requestFocus();
						//txtCartao.setText(totalVenda.getText());
					}
				}
			}
		});

		txtDinheiro.setColumns(10);
		
		txtCartao = new JFormattedTextField(convert);
		
		txtCartao.setForeground(Color.WHITE);
		txtCartao.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtCartao.setColumns(10);
		txtCartao.setOpaque(false);
		txtCartao.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cart\u00E3o-1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		txtCartao.setBackground(Color.DARK_GRAY);
		txtCartao.setBounds(20, 202, 252, 56);
		txtCartao.setCaretColor(Color.WHITE);
		getContentPane().add(txtCartao);
		txtCartao.addKeyListener(new KeyListener() {
			
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
				   if(txtCartao.getText().equals("")) {
						txtCartao2.requestFocus();
					}
				   else {
					totalVenda.setText(totalVenda.getText().replace(",","."));	
					totalVenda.setText(convert.format(ComandText.diminuir(totalVenda, txtCartao)));
					txtCartao2.requestFocus();
				   }
				}
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					dispose();
				}
			}
		});
		
		txtCartao2 =new JFormattedTextField(convert);
		txtCartao2.setForeground(Color.WHITE);
		txtCartao2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtCartao2.setColumns(10);
		txtCartao2.setOpaque(false);
		txtCartao2.setCaretColor(Color.WHITE);
		txtCartao2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cart\u00E3o-2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		txtCartao2.setBackground(Color.DARK_GRAY);
		txtCartao2.setBounds(328, 202, 252, 56);
	    getContentPane().add(txtCartao2);
		txtCartao2.addKeyListener(new KeyListener() {
			
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
				
				else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					if(txtCartao2.getText().equals("")) {
					    tipoCartao();
					    dispose();
						tela.dispose();
						new TelaPDV();
					}
					else {
						totalVenda.setText(totalVenda.getText().replace(",","."));		
						totalVenda.setText(convert.format(ComandText.diminuir(totalVenda, txtCartao2)));
						tipoCartao();
						dispose();
						tela.dispose();
						new TelaPDV();
					}
				}
			}
		});
		
		totalVenda = new JLabel("");
		totalVenda.setBackground(Color.RED);
		totalVenda.setForeground(Color.WHITE);
		totalVenda.setOpaque(true);
		totalVenda.setHorizontalAlignment(SwingConstants.CENTER);
		totalVenda.setFont(new Font("Tahoma", Font.BOLD, 40));
		totalVenda.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Total da Venda", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(255, 255, 255)));
		totalVenda.setBounds(328, 73, 322, 81);
		getContentPane().add(totalVenda);
		
		lblNewLabel = new JLabel("Pagamento com Cart\u00E3o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 640, 62);
		getContentPane().add(lblNewLabel);
		
	}

}
