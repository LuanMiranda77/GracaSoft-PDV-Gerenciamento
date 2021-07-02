package DAO;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.DividaDAO;
import DAO.FuncionarioDAO;
import DAO.IClienteDAO;
import DAO.ICompraDAO;
import DAO.IDividaDAO;
import DAO.IFuncionarioDAO;
import DAO.IImovelDAO;
import DAO.ITipoimovel;
import DAO.ImovelDAO;
import DAO.TipoImovelDAO;
import DAO.InterFace.FabFactory;



public class BDarquivo implements FabFactory {

	public ICliente fabricarClie() {
		return  new ClienteDAO();
	}

	public  IFuncionario fabricarFun() {
		return new FuncionarioDAO();
	}

	public ICompraDAO fabricarComp() {
		return new CompraDAO();
	}

	public IImovelDAO fabricarImovel() {
		return new ImovelDAO();
	}
	
	public ITipoimovel fabricarTipo() {
		return new TipoImovelDAO();
	}

	@Override
	public IDividaDAO fabricarDvida() {
		// TODO Auto-generated method stub
		return new DividaDAO();
	}


}
