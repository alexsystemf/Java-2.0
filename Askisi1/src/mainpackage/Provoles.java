package mainpackage;


public class Provoles {

	public String provoliId;
	public String provoliFilm;
	public String provoliCinema;
	public String provoliStartDate;
	public String provoliIsAvailable;
	public String provoliEndDate;
	public String provoliNumberofReservations;

	
	public Provoles (String startprovoliId, String startprovoliFilm, String startprovoliCinema, String startprovoliStartDate, String startprovoliIsAvailable, String startprovoliEndDate, String startprovoliNumberofReservations){
		
		provoliId = startprovoliId;
		provoliFilm = startprovoliFilm;
		provoliCinema = startprovoliCinema;
		provoliStartDate = startprovoliStartDate;
		provoliIsAvailable = startprovoliIsAvailable;
		provoliEndDate = startprovoliEndDate;
		provoliNumberofReservations = startprovoliNumberofReservations;
		
	}
	
	public void setter(String provoliId, String provoliFilm, String provoliCinema, String provoliStartDate, String provoliIsAvailable, String provoliEndDate, String provoliNumberofReservations) {
	       this.provoliId = provoliId;
	       this.provoliFilm = provoliFilm;		//Setter
	       this.provoliCinema = provoliCinema;		//Gia ta attributes
	       this.provoliStartDate = provoliStartDate;
	       this.provoliIsAvailable = provoliIsAvailable;
	       this.provoliEndDate = provoliEndDate;		
	       this.provoliNumberofReservations = provoliNumberofReservations;		
	       
	}
	
	public class getter {
		  public String provoliId;
		  public String provoliFilm;			//Getter 
		  public String provoliCinema;			//Gia ta attributes
		  public String provoliStartDate;
		  public String provoliEndDate;			
		  public String provoliNumberofReservations;			
		  public String provoliIsAvailable;
		  
			  public String getter1(String provoliId) {
			      
				  return this.provoliId = provoliId;
			    }
			  
			  public String getter2(String provoliFilm) {
			      
				  return this.provoliFilm = provoliFilm;
			    }
			  
			  public String getter3(String provoliCinema) {
			      
				  return this.provoliCinema = provoliCinema;
			    }
			  
			  public String getter4(String provoliStartDate) {
			      
				  return this.provoliStartDate = provoliStartDate;
			    }
			  
			  public String getter5(String provoliEndDate) {
			      
				  return this.provoliEndDate = provoliEndDate;
			    }
			  
			  public String getter6(String provoliNumberofReservations) {
			      
				  return this.provoliNumberofReservations = provoliNumberofReservations;
			    }
			  
			  public String getter7(String provoliIsAvailable) {
			      
				  return this.provoliIsAvailable = provoliIsAvailable;
			    }
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
