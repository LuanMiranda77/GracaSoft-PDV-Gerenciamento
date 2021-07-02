package VIEW.tabela;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import DTO.ProdutoDTO;
import ExcpitonGeral.ExceptionProdutoNaoVend;

public class PDVtableModel extends AbstractTableModel {
	private List<ProdutoDTO> lista = new ArrayList<ProdutoDTO>();
	private String[] colunas = { "Item", "Codigo", "Descrição", "MED", "Quant", "Preço", "SubTotal", "CFOP" };
	private int cont = 0;
	private double valorTotal = 0;

	@Override
	public String getColumnName(int column) {
		return colunas[column];
	}

	@Override
	public int getRowCount() {
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		switch (columnIndex) {

		case 0:
           return rowIndex+1;
		case 1:
			return lista.get(rowIndex).getId();

		case 2:
			return lista.get(rowIndex).getNome();

		case 3:
			return lista.get(rowIndex).getMed();

		case 4:
			return lista.get(rowIndex).getQuantVend();

		case 5:
			return lista.get(rowIndex).getPrecoUnit();

		case 6:
			return lista.get(rowIndex).getSubTotal();

		case 7:
			return lista.get(rowIndex).getCfop();

		default:
			return null;
		}
	}

	@Override
	public void setValueAt(Object valor, int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			 cont=0;
			break;

		case 1:
			lista.get(rowIndex).setId((int) valor);
			break;

		case 2:
			lista.get(rowIndex).setNome((String) valor);
			break;

		case 3:
			lista.get(rowIndex).setMed((String) valor);
			break;

		case 4:
			lista.get(rowIndex).setQuantVend((double) valor);
			break;

		case 5:
			lista.get(rowIndex).setPrecoUnit(Float.parseFloat((String) valor));
			break;

		case 6:
			lista.get(rowIndex).setSubTotal( (double) valor);
			break;

		case 7:
			lista.get(rowIndex).setCfop((int) valor);
			break;
		}
	}

	public double mutiplica(double v1, double v2) {
		return v1 * v2;
	}

	public void addRow(ProdutoDTO p) {
		double v = mutiplica(p.getQuantVend(), p.getPrecoUnit());
		p.setSubTotal(v);
		lista.add(p);
		this.fireTableDataChanged();
		valorTotal += p.getSubTotal();
		cont++;
	}

	public void buscarQuantVend(String codigo) throws ExceptionProdutoNaoVend{
		int cont=0,cont1=-1;
		double q=0;
		boolean band =false;
	    for(ProdutoDTO p : lista) {
	    	if(p.getCodBarra().equals(codigo)) {
	    		q+=lista.get(cont).getQuantVend();	
	    				band=true;
	    				cont1++;
	    	}
	    	cont++;
	    }
	    if(band==false) {
	    		throw new ExceptionProdutoNaoVend();
	    }
	    else{
	    	double quant=Double.parseDouble(JOptionPane.showInputDialog(null,"Quantidade do PRODUTO é: "+
    			 									q+" Digite a quantidade a ser cancelada?",JOptionPane.QUESTION_MESSAGE));
	    	if(quant>=q) {
	    		valorTotal-=Double.parseDouble(""+getValueAt(cont1, 6));
	    		removeRow(cont1);
	    		fireTableRowsDeleted(cont1, cont1);
	    		
	    	}
	    	else {
	    	double res=Float.parseFloat(""+getValueAt(cont1, 4))-quant;
	    	setValueAt(res, cont1,4);
	    	double subT=mutiplica(res, Float.parseFloat(""+getValueAt(cont1, 5)));
	    	valorTotal-=Double.parseDouble(""+getValueAt(cont1, 6));
	    	setValueAt(subT,cont1, 6);
	    	valorTotal+=subT;
	    	this.fireTableDataChanged();
	    	}
	    }
	   // return q;
	}

	public double totalList() {
		return valorTotal;
	}
	public void removeRow(int linha) {
		lista.remove(linha);
	}
	public String toString() {
		return ""+cont;
	}

}
