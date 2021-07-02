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



public class TabelaNFE extends JTable {
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
	    modelo.addColumn("Prenota");    //coluna 0
	    modelo.addColumn("Numero");           //coluna 1
	    modelo.addColumn("Mod");       //coluna 2
	    modelo.addColumn("Data_Emissao");
	    modelo.addColumn("Status");     //coluna 3//coluna
	    modelo.addColumn("ID_Cli");    //coluna 5
	    modelo.addColumn("Destinatario");
	    modelo.addColumn("Protocolo");      //coluna 4
	    modelo.addColumn("Chave Acesso");  //coluna 6
	   
		tabela = new JTable(modelo);   //coluna 12
		
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(300);	
		
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
