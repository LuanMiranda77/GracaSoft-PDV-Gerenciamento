package DTO;

import java.sql.Time;
import java.util.Date;

public class CaixaDTO {
	// atributos
	long numero;
	private double especie;
	private double cartao;
	private double cupom;
	private double convenio;
	private double carne;
	private double saldoTotal;
	private Date data;
	private Time hora;
	private String nomeFunc;
	private String status;
	
	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getCarne() {
		return carne;
	}
	public void setCarne(double carne) {
		this.carne = carne;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getNomeFunc() {
		return nomeFunc;
	}
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getEspecie() {
		return especie;
	}
	public void setEspecie(double especie) {
		this.especie = especie;
	}
	public double getCartao() {
		return cartao;
	}
	public void setCartao(double cartao) {
		this.cartao = cartao;
	}
	public double getCupom() {
		return cupom;
	}
	public void setCupom(double cupom) {
		this.cupom = cupom;
	}
	public double getConvenio() {
		return convenio;
	}
	public void setConvenio(double convenio) {
		this.convenio = convenio;
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
}
	
	
