package DAO.InterFace;
import DTO.ContadorDTO;


public interface IContador {

	public void cadastrar(ContadorDTO  cdto);
	public void editar(ContadorDTO  editado);
	public ContadorDTO  pesquisar();

}
