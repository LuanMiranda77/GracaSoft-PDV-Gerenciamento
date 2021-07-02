package DAO.InterFace;
import DTO.FaturaDTO ;


public interface IFatura {

	public void cadastrar(FaturaDTO  cdto);
	public void excluir(int id);
	public FaturaDTO  lista();
	public FaturaDTO  pesquisar(int id);
	public FaturaDTO  pesquisar(String nome);
	public void editar(FaturaDTO  editado);
	public int tamanho();
}
