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
import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;



public class TabelaFunc extends JTable {
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
	    modelo.addColumn("ID");    //coluna 0
	    modelo.addColumn("CPF");           //coluna 1
	    modelo.addColumn("Nome");       //coluna 2
	    modelo.addColumn("Salario");
	    modelo.addColumn("Telefone");     //coluna 3
	    modelo.addColumn("Cargo");      //coluna 4
	    modelo.addColumn("CEP");    //coluna 5
	    modelo.addColumn("Rua");  //coluna 6
	    modelo.addColumn("Num");  //coluna 7
	    modelo.addColumn("Bairro");  //coluna 8
		modelo.addColumn("Cidade");   //coluna 9
		modelo.addColumn("E-mail");   //coluna 10
		modelo.addColumn("UF");   //coluna 11
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
	
	public void addLinha(FuncionarioDTO p) {
		modelo.addRow(new Object[] {p.getId(),
									 p.getCPF(),
									 p.getNome(),
									 p.getSalario(),
									 p.getTelefone(),
									 p.getCargo(),
									 p.getCep(),
									 p.getRua(),
									 p.getNum(),
									 p.getBairro(),
									 p.getCidade(),
									 p.getEmil(),
									
		
	});
	}
}
