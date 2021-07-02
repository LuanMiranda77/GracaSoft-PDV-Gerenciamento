package DAO.InterFace;
import DTO.ClienteDTO;
import ExcpitonGeral.ExceptionCliente;
import ExcpitonGeral.ExceptionClienteDivida;

public interface ICliente {

	public void cadastrar(ClienteDTO cdto)throws ExceptionCliente ;
	public void excluir(int id)throws ExceptionClienteDivida;
	public ClienteDTO lista();
	public ClienteDTO pesquisar(int id);
	public ClienteDTO pesquisar(String nome);
	public void editar(ClienteDTO editado);
	public int tamanho();
}
