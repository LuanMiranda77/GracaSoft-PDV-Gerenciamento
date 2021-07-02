package MODEL;

import DAO.InterFace.FabFactory;
import DTO.ContadorDTO;
import DTO.EmitenteDTO;

public class Contador extends PessoaFisica{
	
	private String CRC;
	private String CNPJ;
	private FabFactory faby;
	
	
	public String getCRC() {
		return CRC;
	}
	public void setCRC(String cRC) {
		CRC = cRC;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	//metodos da class
	
		public void salvar(ContadorDTO novo){
			faby.fabricarContador().cadastrar(novo);
		}
		
		public void editar(ContadorDTO editado){
			faby.fabricarContador().editar(editado);
				
			}
		public ContadorDTO consulta() {
			return faby.fabricarContador().pesquisar();
		}
	

}
