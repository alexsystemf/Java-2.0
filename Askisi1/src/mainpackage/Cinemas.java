package mainpackage;


public class Cinemas {

	public String cinemaNumberofSeats;
	public String cinemaIs3D;
	public String cinemaId;
	
	public Cinemas (String startcinemaIs3D, String startcinemaNumberofSeats, String startcinemaId){
		
		cinemaIs3D = startcinemaIs3D;
		cinemaNumberofSeats = startcinemaNumberofSeats;
		cinemaId = startcinemaId;
	}
	
	public void setter(String cinemaIs3D, String cinemaNumberofSeats, String cinemaId) {
	       this.cinemaIs3D = cinemaIs3D;
	       this.cinemaNumberofSeats = cinemaNumberofSeats;		//Setter	
	       this.cinemaId = cinemaId;							//Gia ta attributes
	}
	
	public class getter {
		  public String cinemaIs3D;
		  public String cinemaNumberofSeats;			//Getter 
		  public String cinemaId;						//Gia ta attributes
		  
			  public String getter1(String cinemaIs3D) {
			      
				  return this.cinemaIs3D = cinemaIs3D;
			    }
			  
			  public String getter2(String cinemaNumberofSeats) {
			      
				  return this.cinemaNumberofSeats = cinemaNumberofSeats;
			    }
			  			  
			  public String getter3(String cinemaId) {
			      
				  return this.cinemaId = cinemaId;
			    }
			  
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
