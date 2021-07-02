package DAO.InterFace;

public interface FabFactory {
	
	public ICliente fabricarClie();
	
	public IFuncionario fabricarFun();
	
	public IEmitente fabricarEmitente();
	
	public IFatura fabricarFatura();
	
	public IFornecedor fabricarFornec();
	
	public INFCe fabricarNFCe();
	
	public INFe fabricarNFe();
	
	public IProduto fabricarProduto();
	
	public ITransporte fabricarTransport();
	
	public IContador fabricarContador();
	
	public ICupom fabricarCupom();
	
	public ICaixa fabricarCaixa();
}
