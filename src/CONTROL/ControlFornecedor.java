package CONTROL;


import DTO.FornecedorDTO;
import ExcpitonGeral.ExceptionFornecedor;
import MODEL.Fornecedor;

public class ControlFornecedor {
	private static Fornecedor cox= new Fornecedor();
	
	
public static void salvar(FornecedorDTO novo) throws ExceptionFornecedor {
		cox.cadastrar(novo);
	}
	
public static void editar(FornecedorDTO editar) {
	cox.editar(editar);
	}

public static void excluir(int id) {
	cox.excluir(id);
}
public static FornecedorDTO consulta(int id) {
	return cox.pesquisar(id);
}
public static FornecedorDTO consulta(String nome) {
	return cox.pesquisar(nome);
}
public static FornecedorDTO consultaCNPJ(String cnpj) {
	return cox.pesquisarCNPJ(cnpj);
}
public static FornecedorDTO lista(){
	
	return cox.lista();
}

}
