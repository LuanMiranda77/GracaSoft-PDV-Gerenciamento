package MODEL;

import DAO.InterFace.FabFactory;
import DTO.ProdutoDTO;

public class Produto {
	
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
	
	
	
	//metods da class
	private FabFactory faby;
			public void cadastrar(ProdutoDTO novo) {
				faby.fabricarProduto().cadastrar(novo);
			}
			public void editar(ProdutoDTO editado) {
				faby.fabricarProduto().editar(editado);
			}
			public void excluir(int id){
				faby.fabricarProduto().excluir(id);
			}
			public ProdutoDTO lista(){
				return faby.fabricarProduto().lista();
			}
			public ProdutoDTO pesquisar(int id) {
				return  faby.fabricarProduto().pesquisar(id);
			}
			public ProdutoDTO pesquisar(String nome) {
				return  faby.fabricarProduto().pesquisar(nome);
			}
			public ProdutoDTO pesquisarCod(String barras) {
				return  faby.fabricarProduto().pesquisar(barras);
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
