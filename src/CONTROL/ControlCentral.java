package CONTROL;

import MODEL.Central;
import MODEL.Funcionario;

public class ControlCentral {
	
	public static void setLogado(Funcionario novo) {
		Central.setLogado(novo);
	}
	public static Funcionario getLogado() {
		return Central.getLogado();
		
	}

}
