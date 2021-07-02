package CONTROL;


import DTO.NFCeDTO;

import MODEL.NFCe;

public class ControlNFCe {
private static NFCe cox= new NFCe();
	
	
	public static void salvar(NFCeDTO novo){
			cox.cadastrar(novo);
		}
		
	public static void editar(NFCeDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static NFCeDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static NFCeDTO consulta(String nome) {
		return cox.pesquisar(nome);
	}
	public static NFCeDTO lista(){
		
		return cox.lista();
	}

}
