package DAO.InterFace;
import DTO.EmitenteDTO ;


public interface IEmitente {

	public void cadastrar(EmitenteDTO  cdto);
	public void editar(EmitenteDTO  editado);
	public EmitenteDTO  pesquisar();

}
