package CONTROL;


import DTO.ClienteDTO;
import ExcpitonGeral.ExceptionCliente;
import ExcpitonGeral.ExceptionClienteDivida;
import MODEL.Cliente;

public class ControlCliente {
	private static Cliente cl = new Cliente();
	
	
public static void salvar(ClienteDTO novo) throws ExceptionCliente {
			cl.cadastrar(novo);
		
	}
	
public static void editar(ClienteDTO editar) {
		cl.editar(editar);
	}

public static void excluir(int id) throws ExceptionClienteDivida {
	cl.excluir(id);
}

public static ClienteDTO consultaN(String nome) {
	return cl.pesquisarN(nome);
}

public static ClienteDTO consulta(String CPF) {
	return cl.pesquisar(CPF);
}
public static ClienteDTO consulta(int id) {
	return cl.pesquisar(id);
}
public static ClienteDTO lista(){
	return cl.lista();
}

}
