package office.number.exceptions;

public class policeofficenumberException extends Exception{

	public policeofficenumberException (String message){
		super(message);
	}
	
	public policeofficenumberException(){
		super("This is police office number. 112.");
	}
}
