package MODEL;

import DAO.ConfigXml;
import DTO.ConfigDTO;

public class Config extends ConfigDTO{
	
	private ConfigXml conex = new ConfigXml(); 
	
	//metods the class
	public void salvar (ConfigDTO novo) {
	    conex.setConfig(novo);
		
	}
	public ConfigDTO ConsultarConfig() {
		return conex.getConfig();
	}
	public static void main(String[] args) {
		Config d= new Config();
		ConfigDTO p = d.ConsultarConfig();
		p.setTipoEmpresa("dsd");
		d.salvar(p);
	}
}
