package DAO;

import DAO.InterFace.FabFactory;
import DAO.InterFace.ICaixa;
import DAO.InterFace.ICliente;
import DAO.InterFace.IContador;
import DAO.InterFace.ICupom;
import DAO.InterFace.IEmitente;
import DAO.InterFace.IFatura;
import DAO.InterFace.IFornecedor;
import DAO.InterFace.IFuncionario;
import DAO.InterFace.INFCe;
import DAO.InterFace.INFe;
import DAO.InterFace.IProduto;
import DAO.InterFace.ITransporte;

public class BDrelacional implements FabFactory {

	@Override
	public ICliente fabricarClie() {
		
		return new ClienteMysql();
	}

	@Override
	public IFuncionario fabricarFun() {
		return new FuncionarioMysql();
	}

	@Override
	public IEmitente fabricarEmitente() {
		
		return new EmitenteMysql();
	}

	@Override
	public IFatura fabricarFatura() {
		return new FaturaMysql();
	}

	@Override
	public IFornecedor fabricarFornec() {
		return new FornecedorMysql();
	}

	@Override
	public INFCe fabricarNFCe() {
		return new NFCeMysql();
	}

	@Override
	public INFe fabricarNFe() {
		return new NFeMysql();
	}

	@Override
	public IProduto fabricarProduto() {
		return new ProdutoMysql();
	}

	@Override
	public ITransporte fabricarTransport() {
		return new TransporteMysql();
	}

	@Override
	public IContador fabricarContador() {
		// TODO Auto-generated method stub
		return new ContadorMysql();
	}

	@Override
	public ICupom fabricarCupom() {
		return new CupomMysql();
	}

	@Override
	public ICaixa fabricarCaixa() {
		// TODO Auto-generated method stub
		return new CaixaMysql();
	}
	

	


}
