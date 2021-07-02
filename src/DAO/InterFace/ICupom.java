package DAO.InterFace;
import DTO.CupomDTO;


public interface ICupom {

	public void cadastrar(CupomDTO cdto);
	public void excluir(int id);
	public CupomDTO lista();
	public CupomDTO pesquisar(int id);
	public CupomDTO pesquisar(String nome);
	public void editar(CupomDTO editado);
	public int tamanho();
}
