package DAO.InterFace;



import DTO.FuncionarioDTO;
import ExcpitonGeral.ExceptionFuncionario;

public interface IFuncionario {

	public void cadastrar(FuncionarioDTO fdto) throws ExceptionFuncionario;
	public void editar(FuncionarioDTO fdto);
	public FuncionarioDTO pesquisar(String nome);
	public FuncionarioDTO pesquisar(int id);
	public void excluir(int id);
	public FuncionarioDTO lista();
	public FuncionarioDTO verificaLogin(FuncionarioDTO fdto);
	
}
