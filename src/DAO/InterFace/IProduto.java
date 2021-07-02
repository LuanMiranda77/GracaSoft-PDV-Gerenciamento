package DAO.InterFace;
import DTO.ProdutoDTO ;


public interface IProduto {

	public void cadastrar(ProdutoDTO  cdto);
	public void excluir(int id);
	public ProdutoDTO  lista();
	public ProdutoDTO  pesquisar(int id);
	public ProdutoDTO  pesquisar(String nome);
	public void editar(ProdutoDTO  editado);
	public int tamanho();
}
