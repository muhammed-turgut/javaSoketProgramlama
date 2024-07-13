
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;




public class Client {
    
	
	public static void main(String[] args) throws IOException  {
	  
            Scanner scanner=new Scanner(System.in);
            Socket client =new Socket("127.0.0.1",6666);
                
            InputStreamReader isr=new InputStreamReader(client.getInputStream());
            BufferedReader br=new BufferedReader(isr);
                
            PrintWriter print=new PrintWriter(client.getOutputStream());
            
            while(true){
               
                System.out.println("Send--->");
                print.println(scanner.nextLine());
                print.flush();
                
                System.out.println("Gelen Veri: "+br.readLine());
                    
                
            }
            
            
            
	}


}