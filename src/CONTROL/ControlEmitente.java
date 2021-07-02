package CONTROL;


import DTO.EmitenteDTO;

import MODEL.Emitente;

public class ControlEmitente {
private static Emitente cox= new Emitente();
	
	
	public static void salvar(EmitenteDTO novo){
			cox.salvar(novo);
		}
		
	public static void editar(EmitenteDTO editar) {
		cox.editar(editar);
		}

	public static EmitenteDTO consulta() {
		return cox.consulta();
	}

}
