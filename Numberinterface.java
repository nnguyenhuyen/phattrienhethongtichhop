import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Numberinterface extends Remote {
    public int demtu(String st) throws RemoteException;
   
    public String daotu(String str) throws RemoteException;
    public String chuan(String t) throws RemoteException;
    public String inhoa(String tt) throws RemoteException;
    public String inthuong(String nt) throws RemoteException;
    public String Menu() throws RemoteException;
    
    
    
}
