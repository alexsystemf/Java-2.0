package mainpackage;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class Films {

	public String filmId;
	public String filmTitle;
	public String filmCategory;
	public String filmDescription;
	
	public Films (String startfilmId, String startfilmTitle, String startfilmCategory, String startfilmDescription){
		
		filmId = startfilmId;
		filmTitle = startfilmTitle;
		filmCategory = startfilmCategory;
		filmDescription = startfilmDescription;
	}
	
	public void setter(String filmId, String filmTitle, String filmCategory, String filmDescription) {
	       this.filmId = filmId;
	       this.filmTitle = filmTitle;		//Setter
	       this.filmCategory = filmCategory;		//Gia ta attributes
	       this.filmDescription = filmDescription;
	}
	
	public class getter {
		  public String filmId;
		  public String filmTitle;			//Getter 
		  public String filmCategory;			//Gia ta attributes
		  public String filmDescription;
		  
			  public String getter1(String filmId) {
			      
				  return this.filmId = filmId;
			    }
			  
			  public String getter2(String filmTitle) {
			      
				  return this.filmTitle = filmTitle;
			    }
			  
			  public String getter3(String filmCategory) {
			      
				  return this.filmCategory = filmCategory;
			    }
			  
			  public String getter4(String filmDescription) {
			      
				  return this.filmDescription = filmDescription;
			    }
			  
	  }
	

	public void Writer(String filmId,String filmTitle,String filmCategory,String filmDescription){
			
			Writer writer = null;
		
			try {
			    writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("films.txt"), "utf-8"));
			    writer.write("filmId: "+ filmId);
			    writer.write("filmTitle: "+ filmTitle);
			    writer.write("filmCategory: "+ filmCategory);
			    writer.write("filmDescription: "+ filmDescription);
			    
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
			   try {writer.close();} catch (Exception e) {/*ignore*/}
			}
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
