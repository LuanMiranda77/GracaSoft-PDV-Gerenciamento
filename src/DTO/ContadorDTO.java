package DTO;

import MODEL.PessoaFisica;

public class ContadorDTO extends PessoaFisica{
	
	private String CRC;
	private String CNPJ;
	
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
	

}
