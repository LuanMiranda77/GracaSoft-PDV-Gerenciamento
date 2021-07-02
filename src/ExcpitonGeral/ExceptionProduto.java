package ExcpitonGeral;


public class ExceptionProduto  extends Exception{
	public String getMessage() {
		return "Produto com esse codigo de barras  já esta cadastrado !";
	}
}
