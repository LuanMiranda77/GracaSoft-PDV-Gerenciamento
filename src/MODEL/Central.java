package MODEL;

import DAO.CentralXml;

public class Central {
	private static CentralXml conexao = new CentralXml();
	
	public static void setLogado(Funcionario novo) {
		conexao.setLogado(novo);
	}
	public static  Funcionario getLogado() {
		return conexao.getLogado();
		
	}
}
