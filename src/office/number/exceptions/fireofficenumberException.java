package office.number.exceptions;

public class fireofficenumberException extends Exception{

	public fireofficenumberException (String message){
		super(message);
	}
	
	public fireofficenumberException(){
		super("This is fire office number. 119 ");
	}
}
