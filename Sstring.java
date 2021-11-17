import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Sstring extends UnicastRemoteObject implements Numberinterface {
    protected Sstring() throws RemoteException {
        super();
        //TODO Auto-generated constructor stub
    }
   

    public int demtu(String st) throws RemoteException {
        
       
        StringTokenizer sto=new StringTokenizer(st);
        int sotu=sto.countTokens();
        return sotu;
    }
    public String daotu(String str) throws RemoteException{
        StringBuilder sb= new StringBuilder(str);
        return sb.reverse().toString();
 
     }
    public String chuan(String t) throws RemoteException{
        t= t.trim().toLowerCase();
        //while(result.contains("  ")){
        //    result= result.replace("  ", " ");
         t=t.replaceAll("\\s+", " ");
         String[] temp=t.split(" ");
         t=" ";
         for(int i=0;i<temp.length;i++){
             t+=String.valueOf(temp[i].charAt(0)).toUpperCase() +temp[i].substring(1);
             if(i<temp.length-1)
                t+=" ";
         }   
         return t;
        
        
        
    }
    public String inhoa(String tt) throws RemoteException{
         return tt.toUpperCase();

    }
    public String inthuong(String nt) throws RemoteException{
        return nt.toLowerCase();
    }
   
    public String Menu() throws RemoteException {
        return
            "1. Dem so luong tu\n"+
            "2.Dao nguoc chuoi\n"+
            "3.chuan hoa\n"+
            "4.In hoa\n"+
            "5.In thuong\n"+
         
            "Nhap lua chon: ";
    }
  
} 

   

