package CONTROL;


import DTO.FaturaDTO;

import MODEL.Fatura;

public class ControlFatura {
private static Fatura cox= new Fatura();
	
	
	public static void salvar(FaturaDTO novo){
			cox.cadastrar(novo);
		}
		
	public static void editar(FaturaDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static FaturaDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static FaturaDTO consulta(String cnpj) {
		return cox.pesquisar(cnpj);
	}
	
	public static FaturaDTO lista(){
		
		return cox.lista();
	}

}
