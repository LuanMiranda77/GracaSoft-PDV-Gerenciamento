package ExcpitonGeral;


public class ExceptionProdutoNaoCad  extends Exception{
	public String getMessage() {
		return "Produto não cadastrado !";
	}
}
