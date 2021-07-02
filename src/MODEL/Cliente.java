package MODEL;

import DAO.InterFace.FabFactory;
import DTO.ClienteDTO;
import ExcpitonGeral.ExceptionCliente;
import ExcpitonGeral.ExceptionClienteDivida;

public class Cliente extends PessoaFisica {
	private int id;
	private int codIbge;
	private FabFactory faby;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodIbge() {
		return codIbge;
	}

	public void setCodIbge(int codIbge) {
		this.codIbge = codIbge;
	}

	public void cadastrar(ClienteDTO cdto) throws ExceptionCliente {
		 faby.fabricarClie().cadastrar(cdto);
	}
	public void editar(ClienteDTO cdto) {
		faby.fabricarClie().editar(cdto);
	}
	public void excluir(int id) throws ExceptionClienteDivida {
		faby.fabricarClie().excluir(id);
	}
	public ClienteDTO lista(){
		return faby.fabricarClie().lista();
	}
	public ClienteDTO pesquisar(int id) {
		return  faby.fabricarClie().pesquisar(id);
	}
	public ClienteDTO pesquisar(String CPF) {
		return  faby.fabricarClie().pesquisar(CPF);
	}
	public ClienteDTO pesquisarN(String nome) {
		return  faby.fabricarClie().pesquisar(nome);
	}
	public int tamanho() {
		return faby.fabricarClie().lista().getLista().size();
	}

}
