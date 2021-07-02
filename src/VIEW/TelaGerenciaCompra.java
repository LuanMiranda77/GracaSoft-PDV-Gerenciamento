package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import VIEW.tabela.CompraTableModel;
import VIEW.tabela.ModeloTabela;
import VIEW.tabela.TabelaCompra;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class TelaGerenciaCompra extends Principal {

	private TabelaCompra tabela;
	private BotoesGeral apagar;
	private BotoesGeral alterar;
	private BotoesGeral pesq;
	private BotoesGeral relator;
	private JLabel barra;
	private JLabel barra_1;
	private BotoesGeral novo;
	private JTable tableProd;
	private JScrollPane scrollPane_1;
	private JScrollPane conterFatura;
	private DefaultTableModel modelo;
	private DefaultTableModel faturaMod;
	private JTable fatura;
	private JScrollPane contenerProd;
	private BotoesGeral baixar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					new TelaGerenciaCompra();
				
	}

	/**
	 * Create the frame.
	 */
	public TelaGerenciaCompra() {
		this.setTitle("Gerenciamento de Compra");
		getContentPane().setBackground(Color.GRAY);
		setBackground(Color.GRAY);
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);//seuJFrame
		//setType(java.awt.Window.Type.UTILITY);//nao minimizar
		setBounds(100, 100, 1300, 701);
		setLocationRelativeTo(null);
		botton();
		table(this);
		fatura();
		tabelaProduto();
	//	blackgroud();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				ModeloTabela.destivar(tabela);
			    
			    } 
			    
			   
			});
	

		
		setVisible(true);
		repaint();
		
	}
	public void botton() {
		novo = new BotoesGeral("NOVO",new ImageIcon("Icon/novo.png"),8,-5,100,100);
		novo.setBounds(8, 10, 100, 100);
		novo.setToolTipText("cadastrar novo produto");
		novo.setFont(new Font("Century Gothic", Font.BOLD, 13));
		novo.setForeground(Color.WHITE);
		novo.setTamanho(15);
		novo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/novo.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/novo2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaEntradaNota();
				
			}
		});
		
		apagar = new BotoesGeral("APAGAR",new ImageIcon("Icon/apagar.png"),120,-5,100,100);
		apagar.setBounds(118, 10, 100, 100);
		apagar.setToolTipText("apagar o produto");
		apagar.setFont(new Font("Century Gothic", Font.BOLD, 13));
		apagar.setForeground(Color.WHITE);
		apagar.setTamanho(15);
		apagar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				apagar.setIcon(new ImageIcon("Icon/apagar.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				apagar.setIcon(new ImageIcon("Icon/apagar2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		alterar = new BotoesGeral("NOVO",new ImageIcon("Icon/editar.png"),8,-5,100,100);
		alterar.setBounds(338, 10, 100, 100);
		alterar.setText("ALTERAR");
		alterar.setToolTipText("editar produto");
		alterar.setFont(new Font("Century Gothic", Font.BOLD, 13));
		alterar.setForeground(Color.WHITE);
		alterar.setTamanho(15);
		alterar.repaint();
		alterar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				alterar.setIcon(new ImageIcon("Icon/editar.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				alterar.setIcon(new ImageIcon("Icon/editar2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pesq = new BotoesGeral("<html>PESQUISAR<html>",new ImageIcon("Icon/pesquisa.png"),8,-5,100,100);
		pesq.setBounds(228, 10, 100, 100);
		pesq.setToolTipText("pesquisar o produto");
		pesq.setFont(new Font("Century Gothic", Font.BOLD, 13));
		pesq.setForeground(Color.WHITE);
		pesq.setTamanho(15);
		pesq.repaint();
		pesq.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pesq.setIcon(new ImageIcon("Icon/pesquisa.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				pesq.setIcon(new ImageIcon("Icon/pesquisa2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		relator = new BotoesGeral("",new ImageIcon("Icon/impressora.png"),8,-5,100,100);
		relator.setBounds(450, 10, 100, 100);
		relator.setText("<html>RELATORIO<html>");
		relator.setToolTipText("imprimir relatorio do produto");
		relator.setFont(new Font("Century Gothic", Font.BOLD, 13));
		relator.setForeground(Color.WHITE);
		relator.setTamanho(15);
		relator.repaint();
		relator.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				relator.setIcon(new ImageIcon("Icon/impressora.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				relator.setIcon(new ImageIcon("Icon/impressora2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
			baixar = new BotoesGeral("",new ImageIcon("Icon/impressora.png"),8,-5,100,100);
			baixar.setLocation(558, 10);
			baixar.setText("<html>Dowlond-xml<html>");
			baixar.setToolTipText("imprimir relatorio do produto");
			baixar.setFont(new Font("Century Gothic", Font.BOLD, 13));
			baixar.setForeground(Color.WHITE);
			baixar.setTamanho(15);
			baixar.repaint();
			getContentPane().add(baixar);
			baixar.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					relator.setIcon(new ImageIcon("Icon/impressora.png"));
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					relator.setIcon(new ImageIcon("Icon/impressora2.png"));
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	}
	
	//butoes 
    public void table(JFrame janela) {
	    
	    barra = new JLabel();
	    barra.setBackground(Color.DARK_GRAY);
	    barra.setOpaque(isBackgroundSet());
	    
	    
	    tabela = new TabelaCompra();
	    ModeloTabela.modelogeral(tabela);
	    tabela.gerarTabela(janela,"mercado");
	    tabela.repaint();
	    
	    
	    
	    barra_1 = new JLabel();
	    barra_1.setBounds(1, 0, 1283, 110);
	    barra_1.setBackground(Color.DARK_GRAY);
	    barra_1.setOpaque(isBackgroundSet());
	   
	}
    public void tabelaProduto() {
    	 modelo = new DefaultTableModel();
         modelo.addColumn("CodBarras");    //coluna 0
 	    modelo.addColumn("Descricao");           //coluna 1
 	    modelo.addColumn("Quant");       //coluna 2
 	    modelo.addColumn("Preço_Compra");
 	    modelo.addColumn("Total");     //coluna 3
 	    modelo.addColumn("Treço_venda");      //coluna 4
 	   modelo.addColumn("CFOP");      //coluna 4

 		
 		tableProd = new JTable(modelo);   //coluna 12
 		
 		
 		tableProd.getColumnModel().getColumn(0).setPreferredWidth(120);
 		tableProd.getColumnModel().getColumn(1).setPreferredWidth(220);
 		tableProd.getColumnModel().getColumn(2).setPreferredWidth(100);
 		tableProd.getColumnModel().getColumn(3).setPreferredWidth(100);
 		tableProd.getColumnModel().getColumn(4).setPreferredWidth(100);
 		tableProd.getColumnModel().getColumn(5).setPreferredWidth(100);
 		tableProd.getColumnModel().getColumn(6).setPreferredWidth(95);
 		
 	
 	
 		contenerProd = new JScrollPane(tableProd);
 		contenerProd.setBounds(11, 433, 865, 239);
 		tableProd.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
 		contenerProd.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tabela produto da compra", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
 		getContentPane().setLayout(null);
 		getContentPane().add(alterar);
 		getContentPane().add(pesq);
 		getContentPane().add(apagar);
 		getContentPane().add(relator);
 		getContentPane().add(novo);
 		getContentPane().add(barra_1);
 		getContentPane().add(contenerProd);
 		getContentPane().add(conterFatura);
 		
    	
    }
    public void fatura() {
    	faturaMod= new DefaultTableModel();
	    scrollPane_1 = new JScrollPane();
	    

        faturaMod.addColumn("Numero");    //coluna 0
        faturaMod.addColumn("Valor");           //coluna 1
        faturaMod.addColumn("Vencimento");       //coluna 2
		fatura = new JTable(faturaMod);   //coluna 12
		
		
		fatura.getColumnModel().getColumn(0).setPreferredWidth(120);
		fatura.getColumnModel().getColumn(1).setPreferredWidth(120);
		fatura.getColumnModel().getColumn(2).setPreferredWidth(120);
	
		   conterFatura  = new JScrollPane(fatura);
		   conterFatura.setBounds(886, 433, 389, 239);
		 fatura.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		   conterFatura .setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tabela boleto da compra", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
	   	fatura.repaint();
    	
    }
}
