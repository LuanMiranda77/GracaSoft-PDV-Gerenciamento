package CONTROL;

import DTO.ConfigDTO;
import MODEL.Central;
import MODEL.Config;
import MODEL.Funcionario;

public class ControlConfig {
	private static Config c = new Config();
	
	public static void salvar(ConfigDTO novo) {
		c.salvar(novo);
	}
	public static ConfigDTO retornar() {
		return c.ConsultarConfig();
		
	}
	

}
