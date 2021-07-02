package DAO.InterFace;
import DTO.NFCeDTO;


public interface INFCe {

	public void cadastrar(NFCeDTO  cdto);
	public void excluir(int id);
	public NFCeDTO  lista();
	public NFCeDTO  pesquisar(int id);
	public NFCeDTO  pesquisar(String nome);
	public void editar(NFCeDTO  editado);
	public int tamanho();
}
