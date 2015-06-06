package mainpackage;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Customers {

	String film;
	String reservation;
	String customerid;
	
	public Customers (String startfilm, String startreservation, String startcustomerid){ 
		
		film = startfilm;
		reservation = startreservation;			//Constructor
		customerid = startcustomerid;			//Gia ta attributes
		
	}
	
	  public void setter(String film, String reservation, String customerid) {
	       this.film = film;
	       this.reservation = reservation;		//Setter
	       this.customerid = customerid;		//Gia ta attributes
	    }
	
	  public class getter {
		  public String film;
		  public String reservation;		//Getter 
		  public String customerid;			//Gia ta attributes
		  
		  public String getter1(String film) {
		      
			  return this.film = film;
		    }
		  
		  public String getter2(String reservation) {
		      
			  return this.reservation = reservation;
		    }
		  
		  public String getter3(String customerid) {
		      
			  return this.customerid = customerid;
		    }
		  
	  }
	
	public void ShowAvailableFilms(String film){
		
		
		System.out.println("The available films are"+ film);
	}
	
	public void makeReservation(){
		
		
		
	}
	
	public void viewReservation(){
		
		
		
	}
	
	public void Writer(String film,String reservation,String customerid){
			
			Writer writer = null;
		
			try {
			    writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("customers.txt"), "utf-8"));
			    writer.write("film: "+ film);
			    writer.write(" reservation: "+ reservation);
			    writer.write(" customerid: "+ customerid);
			    
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			   try {writer.close();} catch (Exception e) {/*ignore*/}
			}
		
		}
	
	
	//search method
	public void Search(){
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
