package DAO.InterFace;
import DTO.FornecedorDTO ;


public interface IFornecedor {

	public void cadastrar(FornecedorDTO  cdto);
	public void excluir(int id);
	public FornecedorDTO  lista();
	public FornecedorDTO  pesquisar(int id);
	public FornecedorDTO  pesquisar(String nome);
	public void editar(FornecedorDTO  editado);
	public int tamanho();
}
