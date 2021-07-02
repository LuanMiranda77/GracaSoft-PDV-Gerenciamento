package VIEW.tabela;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 
 * @author luan
 * 
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import CONTROL.ControlProduto;
import DTO.ProdutoDTO;
import VIEW.TelaEstoque;
import VIEW.TelaPDV;



public class TabelaCompra extends JTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8679019858685912438L;
	private CompraTableModel modelo;
	private JScrollPane contener;
	private JTable tabela;

	public void gerarTabela(JFrame janela,String nome) {
		
		modelo = new CompraTableModel();
		
		
		
		
		tabela = new JTable(modelo);   //coluna 12
		
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(220);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(220);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(300);
	
		contener = new JScrollPane(tabela);
		contener.setBounds(10, 110, 1260, 320);
		contener.setBorder(
				new TitledBorder(null, "Tabela de Compras Relizada", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		tabela.setBorder(UIManager.getBorder("FormattedTextField.border"));
		tabela.setFont(new Font("Century Gothic", Font.BOLD, 13));
	    tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
	    janela.add(contener);
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
					long cod = retornarId();
					TelaPDV.capCod(cod);
				}
			}
		
		});
	}

	    	
	   
	
	public int selecionarLinha() {     
	   return tabela.getSelectedRow();	
	}
	
	public void limparTabela(int linha) {
		modelo.removeRow(linha);
	}
	
    public void limparTabela2() {
    	while(tabela.getModel().getRowCount()>0) {
			modelo.removeRow(0);
		}
	}
    
	public long retornarId() {
		 try {
				return (long) tabela.getValueAt(tabela.getSelectedRow(),1);
		 }catch (ArrayIndexOutOfBoundsException e) {
				return -1; 
		 }
	}
	
	public boolean filtroNome(String n) {
		
		    boolean band = false;
		 
			return band;
	}
	public boolean filtroCodBarras(String n) {
		   boolean band=false;
		   String d=n.toUpperCase();
		    
		
			return band;
		}
}
