package mainpackage;

public class Users {

	String name;
	String username;
	String password;
	boolean handshake;
	
	public Users (String startname, String startusername, String startpassword, boolean starthandshake){ 
		
		name = startname;
		username = startusername;		//Constructor
		password = startpassword;		//Gia ta attributes
		handshake = starthandshake;
	}
	
	  public void setter(String name, String username, String password, boolean handshake) {
	       this.name = name;
	       this.username = username;		//Setter
	       this.password = password;		//Gia ta attributes
	       this.handshake = handshake;
	    }
	
	 public class getter {
	  public String name;
	  public String username;		//Getter 
	  public String password;		//Gia ta attributes
	  public boolean handshake; 
	  
	  
	  
	  public String getter1(String name) {
	      
		  return this.name = name;
	    }
	  
	  public String getter2(String username) {
	      
		  return this.username = username;
	    }
	  
	  public String getter3(String password) {
      
		  return this.password = password;
	  	}
	  
	 public boolean getter4(boolean handshake){
		 
	      return this.handshake = handshake;
	 	}
	 
	 }
	
	
	 
	 
	public boolean login(String name,String username,String password,boolean handshake){
		
		
		return handshake;
	}
	
	public void logout(String name,String username,String password){
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
	}


	
}
