package CONTROL;

import java.util.ArrayList;

import DTO.ProdutoDTO;
import ExcpitonGeral.ExceptionProduto;
import MODEL.Produto;

public class ControlProduto {
	
private static Produto cox= new Produto();
	
	public static void salvar(ProdutoDTO novo) throws ExceptionProduto {
			cox.cadastrar(novo);
		}
		
	public static void editar(ProdutoDTO editar) {
		cox.editar(editar);
		}

	public static void excluir(int id) {
		cox.excluir(id);
	}
	public static ProdutoDTO consulta(int id) {
		return cox.pesquisar(id);
	}
	public static ProdutoDTO consulta(String nome) {
		return cox.pesquisar(nome);
	}
	public static ProdutoDTO consultaCod(String barras) {
		return cox.pesquisar(barras);
	}
public static ArrayList<ProdutoDTO> lista(){
	ArrayList<ProdutoDTO> lista = new ArrayList<>();
	for(int con=0;con<1;con++) {
	ProdutoDTO produto = new ProdutoDTO();
	produto.setCodBarra("123");
	produto.setId(15);
	produto.setRef("f15");
	produto.setNome("CIMENTO");
	produto.setMed("TA");
	produto.setPrecoUnit(25);
	produto.setQuant(15f);
	produto.setCfop(5102);
	
	ProdutoDTO produto1 = new ProdutoDTO();
	produto1.setCodBarra("1234");
	produto1.setId(10);
	produto1.setRef("f10");;
	produto1.setNome("FERRO AC 1500");
	produto1.setCit("102");
	produto1.setMed("SC");
	produto1.setPrecoUnit(15);
	produto1.setCfop(5403);
	
	lista.add(produto);
	lista.add(produto1);
	}
	return lista;
}

}
