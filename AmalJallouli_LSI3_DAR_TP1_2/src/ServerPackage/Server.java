package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {





public static void main(String[] args) {
	System.out.println("je suis un serveur");
try {
ServerSocket serverSocket = new ServerSocket (1234);
System.out.println("j'attend un client");
Socket socket = serverSocket.accept();
System.out.println("un client est connecté");
InputStream is =socket.getInputStream();
OutputStream os = socket.getOutputStream();

int nb = is.read() ;
int resultat = nb*5 ;
os.write(resultat);

socket.close();
serverSocket.close();

}
catch( IOException e) { 
	e.printStackTrace();}
}

}
