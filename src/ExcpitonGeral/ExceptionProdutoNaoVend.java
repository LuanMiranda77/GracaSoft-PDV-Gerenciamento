package ExcpitonGeral;


public class ExceptionProdutoNaoVend  extends Exception{
	public String getMessage() {
		return "Produto não esta nessa venda!";
	}
}
