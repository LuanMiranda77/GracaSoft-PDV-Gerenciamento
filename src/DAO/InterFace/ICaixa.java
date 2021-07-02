package DAO.InterFace;
import DTO.CaixaDTO;


public interface ICaixa {

	public void cadastrar(CaixaDTO  cdto);
	public void excluir(int id);
	public CaixaDTO  lista();
	public CaixaDTO  pesquisar(int id);
	public void editar(CaixaDTO  editado);
}
