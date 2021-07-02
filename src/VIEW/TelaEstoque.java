package VIEW;


import java.awt.Color;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import CONTROL.ControlProduto;
import DTO.ProdutoDTO;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class TelaEstoque extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo;
	private JScrollPane contener;
	private JTable tabela = new JTable();
	private JTextField txtPesquisa;

	public TelaEstoque(String tela) {
		setTitle("Estoque de Produto");
		getContentPane().setBackground(Color.GRAY);
		setBackground(Color.GRAY);
		setForeground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);//seuJFrame
		setType(java.awt.Window.Type.UTILITY);//nao minimizar
		setBounds(100, 100, 1200, 600);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		botton(tela);
		bcl();
		table(tela);
		setVisible(true);
		repaint();
		
	}
	public void botton(String tela) {
		
		JLabel at3 = new JLabel("<html>Lista de Comandos:<br>Adicionar Item--> Tecle Enter<br><html>");
		at3.setVerticalAlignment(SwingConstants.TOP);
		at3.setBounds(356,-2,369,83);
		at3.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		at3.setForeground(Color.ORANGE);
		getContentPane().add(at3);
	}

	//barra da tela 
	public void bcl() {
		
		JLabel lblPesquisar = new JLabel("Digite para pesquisar o produto");
		lblPesquisar.setVerticalAlignment(SwingConstants.TOP);
		lblPesquisar.setForeground(Color.ORANGE);
		lblPesquisar.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblPesquisar.setBounds(10, 1, 285, 31);
		getContentPane().add(lblPesquisar);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPesquisa.setBounds(10, 33, 285, 31);
		getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		txtPesquisa.requestFocus();
		txtPesquisa.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
				 limparTabela(); 
				 filtroNome(txtPesquisa.getText());
				 
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				try {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					//tabela.setRowSelectionInterval(0,0);
					tabela.changeSelection(0, 0, false, false);
				}
				else if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					dispose();
				}
				}catch (IllegalArgumentException c) {
					JOptionPane.showMessageDialog(null, "produto não encontrado");
				}
			
			}
		});
		
		
		JLabel barra = new JLabel();
		barra.setBounds(1,-20,1200,110);
		barra.setBackground(Color.DARK_GRAY);
		barra.setOpaque(isBackgroundSet());
		getContentPane().add(barra);
	}
	
	//fundo da tela
	public void blackgroud() {
		JLabel contabil = new JLabel(new ImageIcon("icon/produtoFundo.jpg"));
		contabil.setBounds(1,1,1200,600);
		getContentPane().add(contabil);
		
	}

	//butoes 
    public void table(String tela) {
    	
    	modelo = new DefaultTableModel() {
    		public boolean isCellEditable(int rowIndex, int columnIndex) {
    		    return false;
    		}
    	};
    		
    
    	modelo.addColumn("CodBarras");    //coluna 0
 	    modelo.addColumn("ID");           //coluna 1
 	    modelo.addColumn("CodRef");       //coluna 2
 	    modelo.addColumn("Descrição");
 	    modelo.addColumn("MED");     //coluna 3
 	    modelo.addColumn("Quant");      //coluna 4
 	    modelo.addColumn("Preço_Vend");    //coluna 5
 	    modelo.addColumn("Preço_Comp");  //coluna 6
 	    modelo.addColumn("Fornecedor");  //coluna 7
 	    modelo.addColumn("CIT");  //coluna 8
 		modelo.addColumn("NCM");   //coluna 9
 		modelo.addColumn("CEST");   //coluna 10
 		modelo.addColumn("CSON");   //coluna 11
 		modelo.addColumn("CFOP");   //coluna 11
 		
 		tabela = new JTable(modelo);   //coluna 12
 	
 		
 		
 		tabela.getColumnModel().getColumn(0).setPreferredWidth(110);
 		tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
 		tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
 		tabela.getColumnModel().getColumn(3).setPreferredWidth(250);
 		tabela.getColumnModel().getColumn(4).setPreferredWidth(50);
 		tabela.getColumnModel().getColumn(5).setPreferredWidth(80);
 		tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
 		tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
 		tabela.getColumnModel().getColumn(8).setPreferredWidth(200);	
 		tabela.getColumnModel().getColumn(9).setPreferredWidth(40);	
 		tabela.getColumnModel().getColumn(10).setPreferredWidth(80);
 		tabela.getColumnModel().getColumn(11).setPreferredWidth(80);	
 		tabela.getColumnModel().getColumn(12).setPreferredWidth(50);
 		tabela.getColumnModel().getColumn(12).setPreferredWidth(50);
 		
 		tabela.addKeyListener(new KeyListener() {
			
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
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					long cod = (long) tabela.getValueAt(tabela.getSelectedRow(),1);
					if(tela.equals("pdv")) {
						TelaPDV.capCod(cod);
						dispose();
					}
					else {
						TelaCadNfe.capCod(cod);
						dispose();
					}
				}
				
			}
		});
 		
 		 

 				
 		
 		contener = new JScrollPane(tabela);
 		contener.setBounds(10, 100, 1000, 450);
 		tabela.setBorder(UIManager.getBorder("FormattedTextField.border"));
 		tabela.setFont(new Font("Century Gothic", Font.BOLD, 13));
 	    tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
 	    tabela.addKeyListener(new KeyListener() {
 			
 			@Override
 			public void keyTyped(KeyEvent e) {
 				// TODO Auto-generated method stub
 				
 			}
 			
 			@Override
 			public void keyReleased(KeyEvent e) {
 				
 			}
 			
 			@Override
 			public void keyPressed(KeyEvent e) {
 				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
 					long cod = (long) tabela.getValueAt(tabela.getSelectedRow(),1);
 					if(cod>0) {
 					TelaPDV.capCod(cod);
 					dispose();
 					}
 					else
 						JOptionPane.showMessageDialog(null, "Escolha um produto clicando nele");
 				}
 				
 			}
 		});
 	    	
 	    
 	    for(ProdutoDTO p : ControlProduto.lista()) {
 	    	modelo.addRow(new Object[] {p.getCodBarra(),
 				    					 p.getId(),
 				    					 p.getRef(),
 				    					 p.getNome(),
 				    					 p.getMed(),
 				    					 p.getQuant(),
 				    					 p.getPrecoUnit(),
 				    					 p.getPrecoFabri(),
 				    					 p.getFornecedor(),
 				    					 p.getCit(),
 				    					 p.getNcm(),
 				    					 p.getCest(),
 				    					 p.getCSON(),
 				    					 p.getCfop()
 	    					 
 	    			
 	    	});
 	    	
 	    }
 	    
 		getContentPane().add(contener);
 		tabela.repaint();
 	}
    public void filtroNome(String n) {
    //	n.toUpperCase();
	    for(ProdutoDTO p : ControlProduto.lista()) {
	    	if(p.getNome().contains(n.toUpperCase())) {
 	    	 modelo.addRow(new Object[] {p.getCodBarra(),
 				    					 p.getId(),
 				    					 p.getRef(),
 				    					 p.getNome(),
 				    					 p.getMed(),
 				    					 p.getQuant(),
 				    					 p.getPrecoUnit(),
 				    					 p.getPrecoFabri(),
 				    					 p.getFornecedor(),
 				    					 p.getCit(),
 				    					 p.getNcm(),
 				    					 p.getCest(),
 				    					 p.getCSON(),
 				    					 p.getCfop()
 				    					 
 				
 	    					 
 	    			
 	    	});
	    	}
	    }
	   
}
    public void limparTabela() {
    	while(tabela.getModel().getRowCount()>0) {
			modelo.removeRow(0);
		}
	}
public  static void main(String[] args) {
		new TelaEstoque("");
	}
}
