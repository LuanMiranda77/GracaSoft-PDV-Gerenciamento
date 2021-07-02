package MODEL;

import DAO.InterFace.FabFactory;
import DTO.FornecedorDTO;
import ExcpitonGeral.ExceptionCliente;
import ExcpitonGeral.ExceptionClienteDivida;
import ExcpitonGeral.ExceptionFornecedor;
import ExcpitonGeral.ExceptionFuncionario;

public class Fornecedor extends PessoaJuridica{
	
	
	private FabFactory faby;
	//metods da class
	public void cadastrar(FornecedorDTO cdto) throws ExceptionFornecedor {
		 faby.fabricarFornec().cadastrar(cdto);
	}
	public void editar(FornecedorDTO cdto) {
		faby.fabricarFornec().editar(cdto);
	}
	public void excluir(int id){
		faby.fabricarFornec().excluir(id);
	}
	public FornecedorDTO lista(){
		return faby.fabricarFornec().lista();
	}
	public FornecedorDTO pesquisar(int id) {
		return  faby.fabricarFornec().pesquisar(id);
	}
	public FornecedorDTO pesquisar(String nome) {
		return  faby.fabricarFornec().pesquisar(nome);
	}
	public FornecedorDTO pesquisarCNPJ(String cnpj) {
		return  faby.fabricarFornec().pesquisar(cnpj);
	}
	public int tamanho() {
		return faby.fabricarFornec().lista().getLista().size();
	}

	
}
