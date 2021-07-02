package CONTROL;

import java.util.ArrayList;

import DTO.TransportadoraDTO;
import DTO.ProdutoDTO;
import MODEL.Transportadora;

public class ControlTransp {
	
	
private static Transportadora cox= new Transportadora();
	
	
	public static void salvar(TransportadoraDTO novo){
			cox.cadastrar(novo);
		}
		
	public static void editar(TransportadoraDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static TransportadoraDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static TransportadoraDTO consulta(String cnpj) {
		return cox.pesquisar(cnpj);
	}
	
	public static TransportadoraDTO lista(){
		
		return cox.lista();
	}

}
