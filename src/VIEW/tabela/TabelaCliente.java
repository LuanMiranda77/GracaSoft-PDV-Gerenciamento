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

import CONTROL.ControlCliente;
import CONTROL.ControlProduto;
import DTO.ClienteDTO;
import DTO.ProdutoDTO;



public class TabelaCliente extends JTable {
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
	    modelo.addColumn("ID");    //coluna 0
	    modelo.addColumn("CPF/CNPJ");           //coluna 1
	    modelo.addColumn("Nome");       //coluna 2
	    modelo.addColumn("Telefone");  //coluna 3
	    modelo.addColumn("Rua");     //coluna 4
	    modelo.addColumn("Num");     //coluna 5
	    modelo.addColumn("Bairro");      //coluna 6
	    modelo.addColumn("Cidade");    //coluna 7
	    modelo.addColumn("CEP");  //coluna 8
	    modelo.addColumn("E-mail");  //coluna 9
		modelo.addColumn("Cod_IBGE");   //coluna 10
		tabela = new JTable(modelo);   
		
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(250);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(250);
		tabela.getColumnModel().getColumn(5).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(6).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
		tabela.getColumnModel().getColumn(8).setPreferredWidth(100);	
		tabela.getColumnModel().getColumn(9).setPreferredWidth(150);	
		tabela.getColumnModel().getColumn(10).setPreferredWidth(80);	
		
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
	public void adcionarLinha(ClienteDTO p){
		modelo.addRow(new Object[] {p.getId(),
									 p.getCPF(),
									 p.getNome(),
									 p.getRua(),
									 p.getNum(),
									 p.getBairro(),
									 p.getCidade(),
									 p.getCep(),
									 p.getTelefone(),
									 p.getEmil(),
									 p.getCodIbge()
	 

});
		
}
}
