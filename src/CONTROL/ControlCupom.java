package CONTROL;


import DTO.CupomDTO;

import MODEL.Cupom;

public class ControlCupom {
private static Cupom cox= new Cupom();
	
	
	public static void salvar(CupomDTO novo){
			cox.cadastrar(novo);
		}
		
	public static void editar(CupomDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static CupomDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static CupomDTO consulta(String nome) {
		return cox.pesquisar(nome);
	}
	public static CupomDTO lista(){
		
		return cox.lista();
	}

}
