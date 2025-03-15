
import java.io.*;
import java.net.*;
import java.util.*;
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//System.out.println(TCPClient.getPort());
		String clientsentence;
		String capitalizedsentence;
		ServerSocket welcomeSocket=new ServerSocket(2000);
		while(true) {
            Socket connectionSocket = welcomeSocket.accept(); 
            BufferedReader inFromClient=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
            clientsentence=inFromClient.readLine();
            capitalizedsentence=clientsentence.toUpperCase();
            System.out.println();
            outToClient.writeBytes(capitalizedsentence);
		}
		
	}
}
