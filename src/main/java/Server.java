
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Server {
	public static void main(String[] args) throws IOException {
            ServerSocket server=new ServerSocket(6666);
            Scanner scanner=new Scanner(System.in);
            Socket client =server.accept();
            
            while(true){
            
                InputStreamReader in=new InputStreamReader(client.getInputStream());
                BufferedReader br=new BufferedReader(in);
                
                PrintWriter print=new PrintWriter(client.getOutputStream());
                String gelenVeri = br.readLine();
                System.out.println("Gelen Veri: "+gelenVeri);
                
                System.out.println("Send -->");
                String send=scanner.nextLine();
                
                print.println(send);
                print.flush();                 
                   
            }
	 
     }

}
