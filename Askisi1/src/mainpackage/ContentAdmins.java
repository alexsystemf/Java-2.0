package mainpackage;


public class ContentAdmins {

	String film;
	String contentAdminId;
	String contentAdminPass;
	
	public ContentAdmins (String startfilm, String startcontentAdminId, String startcontentAdminPass){ 
		
		film = startfilm;
		contentAdminId = startcontentAdminId;			//Constructor
		contentAdminPass = startcontentAdminPass;			//Gia ta attributes
		
	}
	
	  public void setter(String film, String contentAdminId, String contentAdminPass) {
	       this.film = film;
	       this.contentAdminId = contentAdminId;		//Setter
	       this.contentAdminPass = contentAdminPass;		//Gia ta attributes
	    }
	
	  public class getter {
		  public String film;
		  public String contentAdminId;		//Getter 
		  public String contentAdminPass;			//Gia ta attributes
		  
		  public String getter1(String film) {
		      
			  return this.film = film;
		    }
		  
		  public String getter2(String contentAdminId) {
		      
			  return this.contentAdminId = contentAdminId;
		    }
		  
		  public String getter3(String contentAdminPass) {
		      
			  return this.contentAdminPass = contentAdminPass;
		    }
		  
	  }
	
	
	public void insertFilm(){
		
		
		
		}
	
	public void deleteFilm(){
		
		
		
		}
	
	public void assignFilmToCinema(){
	
	
	
		}

	public static void main(String[] args) {
		

	}

}
