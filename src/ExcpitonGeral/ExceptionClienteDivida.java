package ExcpitonGeral;

public class ExceptionClienteDivida  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3260949218677429391L;

	public String getMessage() {
		return "Cliente n�o pode ser excluindo por ter dividas!";
	}
}
