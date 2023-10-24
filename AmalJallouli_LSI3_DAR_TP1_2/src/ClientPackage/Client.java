package ClientPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner ; 
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
			System.out.println("je suis un client");
		
		try { 
		Socket socket = new Socket ("Localhost", 1234);
		System.out.println("je suis connecté");
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		int nb;
		Scanner scanner = new Scanner(System.in);
		nb=scanner.nextInt();
		os.write(nb);
		int resultat = is.read();
		System.out.println("resultat"+resultat);
		socket.close();
		}
		
		
		catch (IOException e) { 
		e.printStackTrace();}
		}
		

	}


