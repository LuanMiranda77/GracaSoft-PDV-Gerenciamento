package DTO;

import java.util.ArrayList;

import MODEL.PessoaJuridica;

public class FornecedorDTO extends PessoaJuridica{
	
	//atributos do fornecedor
	private ArrayList<FornecedorDTO> lista = new ArrayList<>();
	
	public ArrayList<FornecedorDTO> getLista() {
		return lista;
	}
	public void setLista(ArrayList<FornecedorDTO> lista) {
		this.lista = lista;
	}
	
	

}
