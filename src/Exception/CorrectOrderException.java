package Exception;

import javax.swing.JOptionPane;

public class CorrectOrderException {
	CorrectOrderException(String side, String address) {
		String message;
		boolean flag = false;
		if(side.equals(address)) {
			message=(null,"PLEASE select an orientation and the direction that you want to field the magic square following the indications");
		}
		else {
			if(side.equals("UP")) {
				if(address.equalsIgnoreCase("NO") || (address.equalsIgnoreCase("NE")))
					flag=true;
			} else if(side.equalsIgnoreCase("LEFT")) {
				if(side.equalsIgnoreCase("NO") || (address.equalsIgnoreCase("SO")))
					flag=true;
			}
			else if(side.equalsIgnoreCase("RIGHT")) {
				if(address.equalsIgnoreCase("SE") || (address.equalsIgnoreCase("NE")))
					flag=true;
			}
			else if(side.equalsIgnoreCase("DOWN")) {
				if(address.equalsIgnoreCase("SE") || (address.equalsIgnoreCase("SO")))
					flag=true;
			}
		}
		if(flag==false) {
			message=(null,"The diretion and orientation aren't correct please select one of the following orders: \n UP(NO or NE)  DOWN(SO or SE)  LEFT(NO or SO)  RIGHT(SE or NE)");
		}
		
		System.out.print(message);
		
	}
}
