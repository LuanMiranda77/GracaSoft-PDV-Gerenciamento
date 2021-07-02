package MODEL;

import DAO.InterFace.FabFactory;
import DTO.EmitenteDTO;

public class Emitente extends PessoaJuridica{
	private FabFactory faby;
	
	
	//metodos da class
	
	public void salvar(EmitenteDTO novo){
		faby.fabricarEmitente().cadastrar(novo);
	}
	
	public void editar(EmitenteDTO editado){
		faby.fabricarEmitente().editar(editado);
			
		}
	public EmitenteDTO consulta() {
		return faby.fabricarEmitente().pesquisar();
	}

	
}
