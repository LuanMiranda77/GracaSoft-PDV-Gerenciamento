package MODEL;

import DAO.InterFace.FabFactory;
import DTO.FuncionarioDTO;
import ExcpitonGeral.ExceptionFuncionario;

public class Funcionario extends PessoaFisica {

	private int id;
	private String cargo;
	private double salario;
	private FabFactory faby;
	//atributos de acesso
	private String senha;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//metods da class
	public void cadastrar(FuncionarioDTO novo) throws ExceptionFuncionario {
		faby.fabricarFun().cadastrar(novo);
	}
	public void editar(FuncionarioDTO editado) {
		faby.fabricarFun().editar(editado);
	}
	public void excluir(int id){
		faby.fabricarFun().excluir(id);
	}
	public FuncionarioDTO lista(){
		return faby.fabricarFun().lista();
	}
	public FuncionarioDTO pesquisar(int id) {
		return  faby.fabricarFun().pesquisar(id);
	}
	public FuncionarioDTO pesquisar(String nome) {
		return  faby.fabricarFun().pesquisar(nome);
	}
	
	
	

}
