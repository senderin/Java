/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkapplications;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class DatagramEx {
    
    public static int serverPort=998;
    public static int clientPort=999;
    public static int buffer_size=1024;
    public static DatagramSocket ds;
    public static byte buffer[]=new byte[buffer_size];
    
    public static void main(String args[]) throws IOException{
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter 0 for Client, 1 for Server: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        DatagramEx temp=new DatagramEx();
        temp.runDatagramEx(n);
    }
    
    public void runDatagramEx(int x) throws SocketException, IOException{
        if(x==1){
            ds=new DatagramSocket(serverPort);
            TheServer();
            
        } else{
            ds=new DatagramSocket(clientPort);
            TheClient();
        }
    }
    
    public void TheServer() throws IOException{
        int pos=0;
        String str="";
        while(true){
            int c=System.in.read();
            switch(c){
                case -1:
                  str="Server Quits.";
                    ds.close();;
                    return;
                case '\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
                    pos=0;
                    break;
                default:
                    buffer[pos++]=(byte) c;
            }
        }
    }
    
     public static void TheClient() throws IOException{
         while(true){
             DatagramPacket p=new DatagramPacket(buffer, buffer.length);
             ds.receive(p);
             String result=new String(p.getData(), 0, p.getLength());
             System.out.println(result);
         }
     }
    
}
