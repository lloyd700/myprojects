
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class LloydClient {
    public static void main(String[] args) throws Exception{
    Socket s=new Socket("127.0.0.1",7878);
    if(s.isConnected()){
    System.out.println("Connected to Server...");
    }
    while(true){
    System.out.println("Enter string to reverse...");
    DataInputStream in=new DataInputStream(System.in);
    String str=in.readLine();
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
    dout.writeUTF(str);
    
    DataInputStream din=new DataInputStream(s.getInputStream());
    String rev=din.readUTF();
    System.out.println("Reversed String:\t"+rev);
            }
    }
}
