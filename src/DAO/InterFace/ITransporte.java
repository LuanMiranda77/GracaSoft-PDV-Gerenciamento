package DAO.InterFace;
import DTO.TransportadoraDTO ;


public interface ITransporte {

	public void cadastrar(TransportadoraDTO  cdto);
	public void excluir(int id);
	public TransportadoraDTO  lista();
	public TransportadoraDTO  pesquisar(int id);
	public TransportadoraDTO  pesquisar(String nome);
	public void editar(TransportadoraDTO  editado);
	public int tamanho();
}
