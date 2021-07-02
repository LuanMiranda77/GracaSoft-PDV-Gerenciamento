package DAO.InterFace;
import DTO.NFeDTO ;


public interface INFe {

	public void cadastrar(NFeDTO  cdto);
	public void excluir(int id);
	public NFeDTO  lista();
	public NFeDTO  pesquisar(int id);
	public NFeDTO  pesquisar(String nome);
	public void editar(NFeDTO  editado);
	public int tamanho();
}
