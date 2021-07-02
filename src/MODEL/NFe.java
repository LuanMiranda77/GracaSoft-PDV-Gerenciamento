package MODEL;

import java.util.ArrayList;
import java.util.Date;

import DAO.InterFace.FabFactory;
import DTO.NFeDTO;

public class NFe{
	private FabFactory faby;
	//dados iniciais da nota
	private String num;
	private  FabricyGeral emitente;
	private int serie;
	private String chaveAcesso;
	private String protocolo;
	private int cod_Natureza_Op;
	private int tipo;
	
	
	//atributos do destinatario e data da compra
	private FabricyGeral destinatario;
	private Date data_emissao;
	private Date data_saida;
	private String hora;
	
	//fatura de pagamento da nota
	private ArrayList<Fatura> listfatura = new ArrayList<>();
	
	//calculo de imposto
	private double baseIcms;
	private double icms;
	private double baseSubt;
	private double subt;
	private  double subTotal; 
	private double frete;
	private double seguro;
	private double descont;
	private double despesasAdcionais;
	private double v_ipi;
	private double total;
	
	
	//dados da trnaportadora
	private Transportadora transporte;
	private int freteTipo;
	private int quant;
	private String especie;
	private String marca;
    private String numeracao;
    private double peso_bruto;
    private double peso_liquido;
    
    ///lista de produtos;
    ArrayList<Produto> listProduto = new ArrayList<>();
    
    //calculo do issqn
    private String insc_municipal;
    private double valor_servico;
    private double base_issqn;
    private double valor_issqn;
    
    //dados adicionais 
    private String rodape_Nfe;
    
    
    // get e set da compra

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public FabricyGeral getEmitente() {
		return emitente;
	}

	public void setEmitente(FabricyGeral emitente) {
		this.emitente = emitente;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public String getProtocolo() {
		return protocolo;
	}
	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getCod_Natureza_Op() {
		return cod_Natureza_Op;
	}

	public void setCod_Natureza_Op(int cod_Natureza_Op) {
		this.cod_Natureza_Op = cod_Natureza_Op;
	}
	

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

    

	public FabricyGeral getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(FabricyGeral destinatario) {
		this.destinatario = destinatario;
	}

	public Date getData_emissao() {
		return data_emissao;
	}

	public void setData_emissao(Date data_emissao) {
		this.data_emissao = data_emissao;
	}

	public Date getData_saida() {
		return data_saida;
	}

	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public ArrayList<Fatura> getListfatura() {
		return listfatura;
	}

	public void setListfatura(ArrayList<Fatura> listfatura) {
		this.listfatura = listfatura;
	}

	public double getBaseIcms() {
		return baseIcms;
	}

	public void setBaseIcms(double baseIcms) {
		this.baseIcms = baseIcms;
	}

	public double getIcms() {
		return icms;
	}

	public void setIcms(double icms) {
		this.icms = icms;
	}

	public double getBaseSubt() {
		return baseSubt;
	}

	public void setBaseSubt(double baseSubt) {
		this.baseSubt = baseSubt;
	}

	public double getSubt() {
		return subt;
	}

	public void setSubt(double subt) {
		this.subt = subt;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public double getDescont() {
		return descont;
	}

	public void setDescont(double descont) {
		this.descont = descont;
	}

	public double getDespesasAdcionais() {
		return despesasAdcionais;
	}

	public void setDespesasAdcionais(double despesasAdcionais) {
		this.despesasAdcionais = despesasAdcionais;
	}

	public double getV_ipi() {
		return v_ipi;
	}

	public void setV_ipi(double v_ipi) {
		this.v_ipi = v_ipi;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Transportadora getTransporte() {
		return transporte;
	}

	public void setTransporte(Transportadora transporte) {
		this.transporte = transporte;
	}

	public int getFreteTipo() {
		return freteTipo;
	}

	public void setFreteTipo(int freteTipo) {
		this.freteTipo = freteTipo;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}

	public double getPeso_bruto() {
		return peso_bruto;
	}

	public void setPeso_bruto(double peso_bruto) {
		this.peso_bruto = peso_bruto;
	}

	public double getPeso_liquido() {
		return peso_liquido;
	}

	public void setPeso_liquido(double peso_liquido) {
		this.peso_liquido = peso_liquido;
	}

	public ArrayList<Produto> getListProduto() {
		return listProduto;
	}

	public void setListProduto(ArrayList<Produto> listProduto) {
		this.listProduto = listProduto;
	}

	public String getInsc_municipal() {
		return insc_municipal;
	}

	public void setInsc_municipal(String insc_municipal) {
		this.insc_municipal = insc_municipal;
	}

	public double getValor_servico() {
		return valor_servico;
	}

	public void setValor_servico(double valor_servico) {
		this.valor_servico = valor_servico;
	}

	public double getBase_issqn() {
		return base_issqn;
	}

	public void setBase_issqn(double base_issqn) {
		this.base_issqn = base_issqn;
	}

	public double getValor_issqn() {
		return valor_issqn;
	}

	public void setValor_issqn(double valor_issqn) {
		this.valor_issqn = valor_issqn;
	}

	public String getRodape_Nfe() {
		return rodape_Nfe;
	}

	public void setRodape_Nfe(String rodape_Nfe) {
		this.rodape_Nfe = rodape_Nfe;
	}
	
	
	//metods da class
			public void cadastrar(NFeDTO novo) {
				faby.fabricarNFe().cadastrar(novo);
			}
			public void editar(NFeDTO editado) {
				faby.fabricarNFe().editar(editado);
			}
			public void excluir(int id){
				faby.fabricarNFe().excluir(id);
			}
			public NFeDTO lista(){
				return faby.fabricarNFe().lista();
			}
			public NFeDTO pesquisar(int id) {
				return  faby.fabricarNFe().pesquisar(id);
			}
			public NFeDTO pesquisar(String nome) {
				return  faby.fabricarNFe().pesquisar(nome);
			}
	
	
    
    
  
    
  
    
	
	
	
	
	
		
	

}
