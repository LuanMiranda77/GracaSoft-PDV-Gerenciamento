package MODEL;

import java.util.ArrayList;
import java.util.Date;

import DAO.InterFace.FabFactory;
import DTO.NFCeDTO;

public class NFCe {	
	private String num;
	private String chaveAcesso;
	private int serie;
	private String protocolo;
	private Cliente cliente;
	private Date data;
	private ArrayList<Produto> listaProd = new ArrayList<>();
	private double valor;
	private FabFactory faby;
	
	
	//metods class
	//metods da class
		public void cadastrar(NFCeDTO novo) {
			faby.fabricarNFCe().cadastrar(novo);
		}
		public void editar(NFCeDTO editado) {
			faby.fabricarNFCe().editar(editado);
		}
		public void excluir(int id){
			faby.fabricarNFCe().excluir(id);
		}
		public NFCeDTO lista(){
			return faby.fabricarNFCe().lista();
		}
		public NFCeDTO pesquisar(int id) {
			return  faby.fabricarNFCe().pesquisar(id);
		}
		public NFCeDTO pesquisar(String nome) {
			return  faby.fabricarNFCe().pesquisar(nome);
		}
		
}	
