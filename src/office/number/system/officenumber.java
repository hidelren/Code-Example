package office.number.system;

import office.number.exceptions.policeofficenumberException;
import office.number.exceptions.fireofficenumberException;
import office.number.exceptions.telassistanceofficeException;

public class officenumber {

	public void onumber(String call)
	throws policeofficenumberException, fireofficenumberException, telassistanceofficeException{
		
	if (call.equals("Police")){//
		throw new policeofficenumberException();
	}else if (call.equals("Fire")){//expired credit card
		throw new fireofficenumberException();
	}else if (call.equals("CallAssistance")){
		throw new telassistanceofficeException();
	}
}
}
