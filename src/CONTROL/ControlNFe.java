package CONTROL;


import DTO.NFeDTO;

import MODEL.NFe;

public class ControlNFe {
private static NFe cox= new NFe();
	
	
	public static void salvar(NFeDTO novo){
			cox.cadastrar(novo);
		}
		
	public static void editar(NFeDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static NFeDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static NFeDTO consulta(String nome) {
		return cox.pesquisar(nome);
	}
	public static NFeDTO lista(){
		
		return cox.lista();
	}

}
