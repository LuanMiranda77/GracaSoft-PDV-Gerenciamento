package VIEW.tabela;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import DTO.NFeCompDTO;

public class CompraTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<NFeCompDTO> lista = new ArrayList<NFeCompDTO>();
	private String[] colunas = {"CNPJ","Manisfestação destinatario","Fornecedor","Fantasia", "Numero","Valor", "Chegada","Emissao", "Chave Acesso"};
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
			return lista.get(rowIndex).getEmitente().getCNPJ();

		case 2:
			return lista.get(rowIndex).getEmitente().getRazao();

		case 3:
			return lista.get(rowIndex).getEmitente().getNomeFatasia();

		case 4:
			return lista.get(rowIndex).getNum();

		case 5:
			return lista.get(rowIndex).getTotal();

		case 6:
			return lista.get(rowIndex).getData_saida();

		case 7:
			return lista.get(rowIndex).getData_emissao();
		case 8:
			return lista.get(rowIndex).getChaveAcesso();	

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
			lista.get(rowIndex).getEmitente().setCNPJ((String) valor);
			break;

		case 2:
			lista.get(rowIndex).getEmitente().setRazao((String) valor);
			break;

		case 3:
			lista.get(rowIndex).getEmitente().setNomeFatasia((String) valor);
			break;

		case 4:
			lista.get(rowIndex).setNum((String) valor);
			break;

		case 5:
			lista.get(rowIndex).setData_saida((Date) valor);
			break;

		case 6:
			lista.get(rowIndex).setData_emissao((Date) valor);
			break;

		case 7:
			lista.get(rowIndex).setChaveAcesso((String) valor);
			break;
		}
	}

	public double mutiplica(double v1, double v2) {
		return v1 * v2;
	}

	public void addRow(NFeCompDTO p) {
		lista.add(p);
		this.fireTableDataChanged();
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
