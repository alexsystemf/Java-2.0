package mainpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Socket {

	public static void main(String[] args) {
		
		//declaration
		ServerSocket MyService;
		Socket serviceSocket = null;
		DataInputStream input;
		PrintStream output;
		
		//SocketCreation
	    try {
	    	
	       MyService = new ServerSocket(666);
	       serviceSocket  = MyService.accept();
	       System.out.print("Server has connected!\n");
	       input = new DataInputStream(serviceSocket.getInputStream());
	       output = new PrintStream(serviceSocket.getOutputStream());
	       output.close();
	       input.close();
	       serviceSocket.close();
	       MyService.close();
	       
	        }
	        catch (IOException e) {
	           System.out.println(e);
	        }
		
	}

}
