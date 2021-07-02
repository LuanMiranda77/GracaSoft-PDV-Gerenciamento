package ExcpitonGeral;


public class ExceptionCliente  extends Exception{
	public String getMessage() {
		return "Cliente já cadastrado !";
	}
}
