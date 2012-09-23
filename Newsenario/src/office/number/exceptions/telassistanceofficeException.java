package office.number.exceptions;

public class telassistanceofficeException extends Exception{

	public telassistanceofficeException (String message){
		super(message);
	}
	
	public telassistanceofficeException(){
		super("This is tel assistance office number. 114 ");
	}
}
