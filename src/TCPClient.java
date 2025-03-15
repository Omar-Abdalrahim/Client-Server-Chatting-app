import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static int Port;
	public static int getPort() {
		return Port;
	}
public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	String sentence;
	String modifiedsentence;
	BufferedReader inputClient = new BufferedReader(new InputStreamReader(System.in));
	/*int port = sc.nextInt();
	while (port < 1024 || port > 49151) {
		port = sc.nextInt();
	}*/
	//Port=port;
	Socket client = new Socket("71.1.2.97", 2000);
	DataOutputStream outToServer = new DataOutputStream(client.getOutputStream());
	BufferedReader inputServer = new BufferedReader(new InputStreamReader(System.in));
	sentence=inputClient.readLine();
	outToServer.writeBytes(sentence+"\n");
	modifiedsentence=inputServer.readLine();
	System.out.println("From Server: "+modifiedsentence);
	client.close();
}
}
