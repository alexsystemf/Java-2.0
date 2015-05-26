package mainpackage;


public class Admins {

	public String userid;
	public String username;
	public String password;
	public String cinema;
	
	public Admins (String startuserid, String startusername, String startpassword, String startcinema){
		
		userid = startuserid;
		username = startusername;
		password = startpassword;
		cinema = startcinema;
	}
	
	public void setter(String userid, String username, String password, String cinema) {
	       this.userid = userid;
	       this.username = username;		//Setter
	       this.password = password;		//Gia ta attributes
	       this.cinema = cinema;
	}
	
	public class getter {
		  public String userid;
		  public String username;			//Getter 
		  public String password;			//Gia ta attributes
		  public String cinema;
		  
			  public String getter1(String userid) {
			      
				  return this.userid = userid;
			    }
			  
			  public String getter2(String username) {
			      
				  return this.username = username;
			    }
			  
			  public String getter3(String password) {
			      
				  return this.password = password;
			    }
			  
			  public String getter4(String cinema) {
			      
				  return this.cinema = cinema;
			    }
			  
	  }
	

	public void createUser(String userid, String username, String password){
		
		
		System.out.println("The user with id"+userid+"was created");
	}
	
	public void searchUser(){
		
		
		
	}
	
	public void deleteUser(){
		
		
		
	}
	
	public void viewAllUsers(String userid){
		
		
		System.out.println("The users are: "+userid);
	}
	
	public void createCourse(){
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
