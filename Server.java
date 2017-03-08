import java.net.*;
import java.io.*;
public class Server{
	private static int port=9500;
	public static void main(String [] args)throws Exception{

			ServerSocket s=new ServerSocket(port);
		while(true){
			Socket s1=s.accept();
			System.out.println("Client connection success!");
			DataOutputStream so=new DataOutputStream(s1.getOutputStream());
			so.writeUTF("FileName:Z.mp3"+"\n"+"ServerIp:"+s.getInetAddress()+"\n"+"ServerPort:"+s.getLocalPort());
			FileInputStream f=new FileInputStream("F:/java/javacs/Z.mp3");
			int b=0;
		  while((b=(f.read()))!=-1){
			so.write(b);
		  }
		s.close();
		f.close();
		s1.close();
		so.flush();
		so.close();
		}
		
	
	  
	
		
	}
}