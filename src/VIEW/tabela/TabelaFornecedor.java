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
import DTO.FornecedorDTO;
import DTO.ProdutoDTO;



public class TabelaFornecedor extends JTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8679019858685912438L;
	private DefaultTableModel modelo;
	private JScrollPane contener;
	private JTable tabela;

	public void gerarTabela(JFrame janela) {
		
		modelo = new DefaultTableModel();
		

	    // modelo da tabela
	    modelo.addColumn("CNPJ");    //coluna 0
	    modelo.addColumn("Razao");           //coluna 1
	    modelo.addColumn("NomeFantazia");       //coluna 2
	    modelo.addColumn("Telefone"); //coluna 3
	    modelo.addColumn("Fax");       //coluna 4
	    modelo.addColumn("E-mail");     //coluna 5
	    modelo.addColumn("CEP");      //coluna 6
	    modelo.addColumn("Rua");    //coluna 7
	    modelo.addColumn("Num");  //coluna 8
	    modelo.addColumn("Bairro");  //coluna 9
	    modelo.addColumn("Cidade");  //coluna 10
		modelo.addColumn("UF");   //coluna 11
		modelo.addColumn("IBGE");   //coluna 12
		modelo.addColumn("InsEst");   //coluna 13
		tabela = new JTable(modelo);  
		
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(50);	
		tabela.getColumnModel().getColumn(9).setPreferredWidth(150);	
		tabela.getColumnModel().getColumn(10).setPreferredWidth(120);
		tabela.getColumnModel().getColumn(11).setPreferredWidth(60);	
		tabela.getColumnModel().getColumn(12).setPreferredWidth(80);	
		tabela.getColumnModel().getColumn(12).setPreferredWidth(80);	
		
		contener = new JScrollPane(tabela);
		contener.setBounds(10, 100, 1000, 450);
		tabela.setBorder(UIManager.getBorder("FormattedTextField.border"));
		tabela.setFont(new Font("Century Gothic", Font.BOLD, 13));
	    tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
	    
		janela.add(contener);
		tabela.repaint();
		
		

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
	public void adicionarLinha(FornecedorDTO p) {
		modelo.addRow(new Object[] {p.getCNPJ(),
									 p.getRazao(),
									 p.getNomeFatasia(),
									 p.getFone(),
									 p.getFax(),
									 p.getEmail(),
									 p.getCep(),
									 p.getRua(),
									 p.getNum(),
									 p.getBairro(),
									 p.getCidade(),
									 p.getUF(),
									 p.getCodIbge(),
									 p.getInscEst(),
									
									 
		
	});
	}
}
