package mainpackage;


public class MainClass {

	
	
	
	public static void main(String[] args) {
		
		//Object definition
		
		Customers xatzimpalakias = new Customers("Oldeuboi","4/5/1789","Xatzis");
		
		ContentAdmins mastigio = new ContentAdmins("Whiplash","Mitsos","MitsarasKafe");
		
		Admins gamagoori_sama = new Admins ("Yanis","Yanis468","YanisVforV3nd374","Asti");
		
		Films LarsvonTrier = new Films("P13007","Tost","Biography","8/8");
		
		Cinemas Iris = new Cinemas("170","No","p1306436");
		
		Provoles provolone = new Provoles("P1305","Oldeuboi","Asti","30/4/2015","Yes","8/7/2015","9999999");
		
		Users pleb = new Users("NETI","NE TI","NETI420", false);
		
		//text file Creation
		
		xatzimpalakias.Writer("Oldeuboi","4/5/1789","Xatzis");
		
		mastigio.Writer("Whiplash","Mitsos","MitsarasKafe");
		
		gamagoori_sama.Writer("Yanis","Yanis468","YanisVforV3nd374","Asti");
		
		LarsvonTrier.Writer("P13007","Tost","Biography","8/8");
		
		Iris.Writer("170","No","p1306436");
		
		provolone.Writer("P1305","Oldeuboi","Asti","30/4/2015","Yes","8/7/2015","9999999");
		
		pleb.Writer("NETI","NE TI","NETI420", false);
		
	}
	
	}	
