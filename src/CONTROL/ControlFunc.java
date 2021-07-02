package CONTROL;

import java.util.ArrayList;

import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import ExcpitonGeral.ExceptionFuncionario;
import MODEL.Funcionario;

public class ControlFunc {
	
	
	private static Funcionario cox= new Funcionario();
	
	
	public static void salvar(FuncionarioDTO novo) throws ExceptionFuncionario {
			cox.cadastrar(novo);
		}
		
	public static void editar(FuncionarioDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static FuncionarioDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static FuncionarioDTO consulta(String nome) {
		return cox.pesquisar(nome);
	}
	public static FuncionarioDTO lista(){
		
		return cox.lista();
	}

}
