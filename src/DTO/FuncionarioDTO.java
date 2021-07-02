package DTO;

import java.util.ArrayList;

import MODEL.PessoaFisica;

public class FuncionarioDTO extends PessoaFisica{

	private int id;
	private String cargo;
	private double salario;
	private ArrayList<FuncionarioDTO> lista = new ArrayList<>();
	
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

	public ArrayList<FuncionarioDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<FuncionarioDTO> lista) {
		this.lista = lista;
	}
	
	
	
	
	

}
