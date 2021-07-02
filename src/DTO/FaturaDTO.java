package DTO;

import java.util.ArrayList;
import java.util.Date;

public class FaturaDTO {
	private String fornCnpj;
	private long nossoNumero;
	private double valor;
	private Date data;
	private String status;
	private ArrayList<FaturaDTO> lista = new ArrayList<>();
	
	
	public String getFornCnpj() {
		return fornCnpj;
	}
	public void setFornCnpj(String fornCnpj) {
		this.fornCnpj = fornCnpj;
	}
	public long getNossoNumero() {
		return nossoNumero;
	}
	public void setNossoNumero(long nossoNumero) {
		this.nossoNumero = nossoNumero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<FaturaDTO> getLista() {
		return lista;
	}
	public void setLista(ArrayList<FaturaDTO> lista) {
		this.lista = lista;
	}
	
	
	

}
