package VIEW.tabela;

import java.awt.Font;


/**
 * 
 * @author luan
 * 
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import CONTROL.ControlProduto;
import DTO.ProdutoDTO;



public class TabelaTransport extends JTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8679019858685912438L;
	private DefaultTableModel modelo;
	private JScrollPane contener;
	private JTable tabela;

	public void gerarTabela(JFrame janela,String nome) {
		
		modelo = new DefaultTableModel();
		
		
		
	    
	    if(nome.equals("mercado")) {
	    // modelo da tabela
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
		tabela.getColumnModel().getColumn(9).setPreferredWidth(30);	
		tabela.getColumnModel().getColumn(10).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(11).setPreferredWidth(80);	
		tabela.getColumnModel().getColumn(12).setPreferredWidth(50);	
		
		contener = new JScrollPane(tabela);
		contener.setBounds(10, 100, 1000, 450);
		tabela.setBorder(UIManager.getBorder("FormattedTextField.border"));
		tabela.setFont(new Font("Century Gothic", Font.BOLD, 13));
	    tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
	    
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
				    					 p.getCfop()
	    					 
	    			
	    	});
	    	
	    }
	    
		janela.add(contener);
		tabela.repaint();
		
		

		}
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
    
	public int retornarId() {
		 try {
				return (int) tabela.getValueAt(tabela.getSelectedRow(),0);
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
