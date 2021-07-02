package CONTROL;


import DTO.ContadorDTO;

import MODEL.Contador;

public class ControlContador {
private static Contador cox= new Contador();
	
	
	public static void salvar(ContadorDTO novo){
			cox.salvar(novo);
		}
		
	public static void editar(ContadorDTO editar) {
		cox.editar(editar);
		}

	public static ContadorDTO consulta() {
		return cox.consulta();
	}

}
