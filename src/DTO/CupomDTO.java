package DTO;

import java.util.ArrayList;
import java.util.Date;

import DAO.InterFace.FabFactory;
import MODEL.Cliente;

public class CupomDTO {	
	private long num;
	private Cliente cliente;
	private Date data;
	private ArrayList<ProdutoDTO> listaProd = new ArrayList<>();
	private double valor;
	private FabFactory faby;
	
	//get e set da Class
	public void cadastrar(NFCeDTO novo) {
		faby.fabricarNFCe().cadastrar(novo);
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public ArrayList<ProdutoDTO> getListaProd() {
		return listaProd;
	}
	public void setListaProd(ArrayList<ProdutoDTO> listaProd) {
		this.listaProd = listaProd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
		
}	
