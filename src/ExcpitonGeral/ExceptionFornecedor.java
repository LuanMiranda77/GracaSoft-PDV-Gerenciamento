package ExcpitonGeral;


public class ExceptionFornecedor  extends Exception{
	public String getMessage() {
		return "Fornecedor já cadastrado !";
	}
}
