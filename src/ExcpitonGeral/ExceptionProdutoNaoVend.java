package ExcpitonGeral;


public class ExceptionProdutoNaoVend  extends Exception{
	public String getMessage() {
		return "Produto n�o esta nessa venda!";
	}
}
