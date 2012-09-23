package cp.office.usher;

import office.number.system.officenumber;

import office.number.exceptions.policeofficenumberException;
import office.number.exceptions.fireofficenumberException;
import office.number.exceptions.telassistanceofficeException;

import java.util.Scanner;

public class AcceptCall {

		public static void main(String[] args){
			try{
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("What do u want know office:");
				String callnumber = scanner.nextLine();
								
				officenumber pg = new officenumber();
		
				pg.onumber(callnumber);
			
			}catch(policeofficenumberException ecce){
				System.err.println(ecce.getMessage());
			}catch(fireofficenumberException scce){
				System.err.println(scce.getMessage());
			}catch(telassistanceofficeException ucce){
				System.err.println(ucce.getMessage());
		}
	}
}

