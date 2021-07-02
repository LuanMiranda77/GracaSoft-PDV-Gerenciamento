package DTO;

import java.util.ArrayList;

public class ProdutoDTO {
	
	//atributos class
	private long id;
	private String codBarra;
	private String ref;
	private int fornecedor;
	private String nome;
	private String med;
	private int ncm;
	private int cest;
	private String cit;
	private int cfop;
	private float quant;
	private float precoUnit;
	private float precoFabri;
	private int CSON;
	private double quantVend;
	private double subTotal;
	private float qComp;
	private String medComp;
	private String descComp;
	private ArrayList<ProdutoDTO> lista = new ArrayList<>();
	
	
	//gets e set da class
	
	public long getId() {
		return id;
	}
	public int getCSON() {
		return CSON;
	}
	public void setCSON(int cSON) {
		CSON = cSON;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(int fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMed() {
		return med;
	}
	public void setMed(String med) {
		this.med = med;
	}
	public int getNcm() {
		return ncm;
	}
	public void setNcm(int ncm) {
		this.ncm = ncm;
	}
	public int getCest() {
		return cest;
	}
	public void setCest(int cest) {
		this.cest = cest;
	}
	public String getCit() {
		return cit;
	}
	public void setCit(String cit) {
		this.cit = cit;
	}
	public int getCfop() {
		return cfop;
	}
	public void setCfop(int cfop) {
		this.cfop = cfop;
	}
	public float getQuant() {
		return quant;
	}
	public void setQuant(float quant) {
		this.quant = quant;
	}
	public float getPrecoUnit() {
		return precoUnit;
	}
	public void setPrecoUnit(float precoUnit) {
		this.precoUnit = precoUnit;
	}
	public float getPrecoFabri() {
		return precoFabri;
	}
	public void setPrecoFabri(float precoFabri) {
		this.precoFabri = precoFabri;
	}
	public ArrayList<ProdutoDTO> getLista() {
		return lista;
	}
	public void setLista(ArrayList<ProdutoDTO> lista) {
		this.lista = lista;
	}
	public double getQuantVend() {
		return quantVend;
	}
	public void setQuantVend(double quantVend) {
		this.quantVend = quantVend;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public float getqComp() {
		return qComp;
	}
	public void setqComp(float qComp) {
		this.qComp = qComp;
	}
	public String getMedComp() {
		return medComp;
	}
	public void setMedComp(String medComp) {
		this.medComp = medComp;
	}
	public String getDescComp() {
		return descComp;
	}
	public void setDescComp(String descComp) {
		this.descComp = descComp;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
