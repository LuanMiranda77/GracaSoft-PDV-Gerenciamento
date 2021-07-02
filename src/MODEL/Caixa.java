package MODEL;

import java.sql.Time;
import java.util.Date;

public class Caixa {
	// atributos
	long numero;
	double especie;
	double cartao;
	double cupom;
	double convenio;
	private Date data;
	private Time hora;
	private String nomeFunc;
	private String status;
	double saldoTotal;
	
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	

}
