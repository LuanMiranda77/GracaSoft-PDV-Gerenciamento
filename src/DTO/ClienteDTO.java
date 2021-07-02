package DTO;
import java.util.ArrayList;

import MODEL.PessoaFisica;


public class ClienteDTO extends PessoaFisica{
	private int id;
	private int codIbge;
	private ArrayList<ClienteDTO> lista = new ArrayList<>();
	private int tipo;
	
	
	

	public int getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(int codIbge) {
		this.codIbge = codIbge;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<ClienteDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ClienteDTO> lista) {
		this.lista = lista;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	

}
