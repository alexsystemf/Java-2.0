package mainpackage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainClass {

	Customers xatzimpalakias = new Customers("Oldeuboi","4/5/1789","Xatzis");
	
	ContentAdmins mastigio = new ContentAdmins("Whiplash","Mitsos","MitsarasKafe");
	
	Admins gamagoori_sama = new Admins ("Yanis","Yanis468","YanisVforV3nd374","Asti");
	
	Films LarsvonTrier = new Films("P13007","Tost","Biography","8/8");
	
	Cinemas Iris = new Cinemas("170","No","p1306436");
	
	Provoles provolone = new Provoles("P1305","Oldeuboi","Asti","30/4/2015","Yes","8/7/2015","9999999");
	
	
	public static void main(String[] args) {
		String filename = "out.txt";
		try {
			PrintWriter outputStream = new PrintWriter(filename);
			outputStream.println();
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}	