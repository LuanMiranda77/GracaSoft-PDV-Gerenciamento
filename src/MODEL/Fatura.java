package MODEL;

import java.util.Date;

import DAO.InterFace.FabFactory;
import DTO.FaturaDTO;
import DTO.FornecedorDTO;
import ExcpitonGeral.ExceptionClienteDivida;
import ExcpitonGeral.ExceptionFuncionario;

public class Fatura {
	private long nossoNumero;
	private double valor;
	private Date data;
	private String status;
	private String fornCnpj;
	
	
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
	

	public String getFornCnpj() {
		return fornCnpj;
	}
	public void setFornCnpj(String fornCnpj) {
		this.fornCnpj = fornCnpj;
	}


	private FabFactory faby;
	//metods da class
	public void cadastrar(FaturaDTO cdto) {
		 faby.fabricarFatura().cadastrar(cdto);
	}
	public void editar(FaturaDTO cdto) {
		faby.fabricarFatura().editar(cdto);
	}
	public void excluir(int id){
		faby.fabricarFatura().excluir(id);
	}
	public FaturaDTO lista(){
		return faby.fabricarFatura().lista();
	}
	public FaturaDTO pesquisar(int id) {
		return  faby.fabricarFatura().pesquisar(id);
	}
	public FaturaDTO pesquisar(String cnpj) {
		return  faby.fabricarFatura().pesquisar(cnpj);
	}
	public int tamanho() {
		return faby.fabricarFatura().lista().getLista().size();
	}

	
	

}
