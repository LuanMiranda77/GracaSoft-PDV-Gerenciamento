package VIEW.tabela;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import DTO.NFeCompDTO;
import DTO.ProdutoDTO;

public class ModelEntrada extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProdutoDTO> lista = new ArrayList<ProdutoDTO>();
	private String[] colunas = {"Cod","Cod.Barras","Descriçõa-XML","UN-XML","Quant-XML", "Preço-XML","Total-XML",
			                     "Minha descrição", "Minha UN","Minha-Quant", "Preço-venda","NCM","CEST","CIT","CSON","CFOP",};
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
			return lista.get(rowIndex).getId();

		case 1:
			return lista.get(rowIndex).getCodBarra();

		case 2:
			return lista.get(rowIndex).getDescComp();

		case 3:
			return lista.get(rowIndex).getMedComp();

		case 4:
			return lista.get(rowIndex).getQuantVend();

		case 5:
			return lista.get(rowIndex).getPrecoFabri();

		case 6:
			return lista.get(rowIndex).getSubTotal();
		case 7:
			return lista.get(rowIndex).getNome();

		case 8:
			return lista.get(rowIndex).getMed();

		case 9:
			return lista.get(rowIndex).getQuant();

		case 10:
			return lista.get(rowIndex).getPrecoUnit();

		case 11:
			return lista.get(rowIndex).getNcm();

		case 12:
			return lista.get(rowIndex).getCest();
		case 13:
			return lista.get(rowIndex).getCit();

		case 14:
			return lista.get(rowIndex).getCSON();

		case 15:
			return lista.get(rowIndex).getCfop();

		default:
			return null;
		}
	}

	@Override
	public void setValueAt(Object valor, int rowIndex, int columnIndex) {
		switch (columnIndex) {

		case 0:
			lista.get(rowIndex).setId((int) valor);
			break;
		case 1:
			lista.get(rowIndex).setCodBarra((String) valor);
			break;
		case 2:
			lista.get(rowIndex).setDescComp((String) valor);
			break;
		case 3:
			lista.get(rowIndex).setMedComp((String) valor);
			break;
			
		case 4:
			lista.get(rowIndex).setQuantVend((float) valor);
			break;
		case 5:
			lista.get(rowIndex).setPrecoFabri((float) valor);
			break;
		case 6:
			lista.get(rowIndex).setSubTotal((double) valor);
			break;
			

		case 7:
			lista.get(rowIndex).setNome((String) valor);
			break;

		case 8:
			lista.get(rowIndex).setMed((String) valor);
			break;

		case 9:
			lista.get(rowIndex).setQuant((float) valor);
			break;

		case 10:
			lista.get(rowIndex).setPrecoUnit(Float.parseFloat((String) valor));
			break;

		case 11:
			lista.get(rowIndex).setNcm( (int) valor);
			break;

		case 12:
			lista.get(rowIndex).setCest((int) valor);
			break;
		case 13:
			lista.get(rowIndex).setCit( (String) valor);
			break;
	
		case 14 :
			lista.get(rowIndex).setCSON((int) valor);
			break;
		case 15 :
			lista.get(rowIndex).setCfop((int) valor);
			break;
	}
	}

	public double mutiplica(double v1, double v2) {
		return v1 * v2;
	}

	public void addRow(ProdutoDTO p) {
		lista.add(p);
		this.fireTableDataChanged();
		valorTotal+=p.getPrecoFabri();
	}
	public void removeRow(int linha) {
		lista.remove(linha);
	}

	public double totalList() {
		return valorTotal;
	}

}
