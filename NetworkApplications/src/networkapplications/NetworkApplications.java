package networkapplications;

import java.io.*;
import java.net.*;
import java.util.*;

public class NetworkApplications {
    
    private static NetworkApplications obj;
    
    private NetworkApplications(){}
    
    public static NetworkApplications getInstance(){
        if(obj==null)
            obj=new NetworkApplications();
        return obj;
    }
    
    //UIGETIP
    public String returnLocalHost() throws UnknownHostException{
        InetAddress add=InetAddress.getLocalHost(); //--> hp-Bilgisayar/192.168.114.1
        String temp=add.toString()+"\n";
        //add.getHostAddress(); --> 192.168.114.1
        //add.getHostName() --> hp-Bilgisayar
        return temp;
    }
    //UIGETIP
    public String returnAddressByName(String name) throws UnknownHostException{
        return InetAddress.getByName(name).toString();
    }
    //UIGETIP
    public String returnAddressesByName(String name) throws UnknownHostException{
        InetAddress[] add= InetAddress.getAllByName(name);
        String temp="";
        for(int i=0; i<add.length; i++){
            temp=add[i].toString()+"\n";
            System.out.println(add[i]);
        }
        return temp;
    }
    //UIWHOIS
    public String whoIs(String args[], String add) throws IOException{
        int c;
        String result="";
        Socket s=new Socket("whois.internic.net", 43);
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();
        
        String str=(args.length==0 ? add:args[0])+"\n";
        
        byte[] buf=str.getBytes();
        
        out.write(buf);
        
        while((c=in.read())!=-1){
            result+=(char)c;
        }
        s.close();
        return result;  
    }
    //UIGETFEATOFURL
    public String getFeaturesOfURL(String url) throws MalformedURLException{
        String result="";
        URL hp=new URL(url);
        result+="Protocol: "+hp.getProtocol();
        result+="\nPort: "+hp.getPort();
        result+="\nHost: "+hp.getHost();
        result+="\nFile: "+hp.getFile();
        result+="\nExt: "+hp.toExternalForm();
        return result;
    }
    
    //UIGETFEATOFURL 
    public String getMore(String url) throws MalformedURLException, IOException{
        int c;
        String result="";
        URL hp=new URL(url);
        URLConnection con=hp.openConnection();
        long d=con.getDate();
        result=(d==0 ? "No date information":("Date: "+new Date(d)))+"\n";
        result+="Content-Type: "+con.getContentType()+"\n";
        d=con.getExpiration();
        result+=(d==0 ? "No expiration information":("Expires: "+new Date(d)))+"\n";
        d=con.getLastModified();
        result+=(d==0 ? "No last-modified information":("Last-modified: "+new Date(d)))+"\n";
        int len=con.getContentLength();
        result+=(len==-1 ? "Content-length unavailable ":"Content-length: "+len)+"\n";
        if(len!=-1){
            result+="=====Content=====\n";
            InputStream in=con.getInputStream();
            int i=len;
            while((c=in.read())!=-1){
                result+=(char)c;
            }
            in.close();
            result+="\n";
        }
        else{
            result+="No content available";
        } 
        return result;
    }
    //UIOPENHTTPCON
    public String openHTTPCon(String url) throws IOException{
        URL hp=new URL(url);
        HttpURLConnection con=(HttpURLConnection)hp.openConnection();
        String result="";
        result="Request method is: "+con.getRequestMethod()+"\n";
        result+="Response code is: "+con.getResponseCode()+"\n";
        Map<String, List<String>> map=con.getHeaderFields();
        Set<String> field=map.keySet();
        result+="=========Header=========\n";
        for(String k : field){
            result+="Key:  "+k+" Value:  "+map.get(k)+"\n";
        }
        return result;
    }
}
