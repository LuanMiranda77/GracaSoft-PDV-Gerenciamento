package MODEL;

import DAO.InterFace.FabFactory;
import DTO.TransportadoraDTO;

public class Transportadora {
	
	//atributos da transportadora
	private int id;
	private String CNPJCPF;
	private String insc_est;
	private String razao;
	private String logradouro;
	private String munic;
	private String ufTrans;
	
	private int cod_ANTT;
	private String placaVeiculo;
	private String ufPlaca;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCNPJCPF() {
		return CNPJCPF;
	}
	public void setCNPJCPF(String cNPJCPF) {
		CNPJCPF = cNPJCPF;
	}
	public String getInsc_est() {
		return insc_est;
	}
	public void setInsc_est(String insc_est) {
		this.insc_est = insc_est;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getMunic() {
		return munic;
	}
	public void setMunic(String munic) {
		this.munic = munic;
	}
	public String getUfTrans() {
		return ufTrans;
	}
	public void setUfTrans(String ufTrans) {
		this.ufTrans = ufTrans;
	}
	public int getCod_ANTT() {
		return cod_ANTT;
	}
	public void setCod_ANTT(int cod_ANTT) {
		this.cod_ANTT = cod_ANTT;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getUfPlaca() {
		return ufPlaca;
	}
	public void setUfPlaca(String ufPlaca) {
		this.ufPlaca = ufPlaca;
	}
	
	private FabFactory faby;
	public void cadastrar(TransportadoraDTO novo) {
		faby.fabricarTransport().cadastrar(novo);
	}
	public void editar(TransportadoraDTO editado) {
		faby.fabricarTransport().editar(editado);
	}
	public void excluir(int id){
		faby.fabricarTransport().excluir(id);
	}
	public TransportadoraDTO lista(){
		return faby.fabricarTransport().lista();
	}
	public TransportadoraDTO pesquisar(int id) {
		return  faby.fabricarTransport().pesquisar(id);
	}
	public TransportadoraDTO pesquisar(String nome) {
		return  faby.fabricarTransport().pesquisar(nome);
	}
	
	
	

}
