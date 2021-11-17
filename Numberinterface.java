import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Numberinterface extends Remote {
    public int demtu(String st) throws RemoteException;

    public String daotu(String str) throws RemoteException;

    public String Menu() throws RemoteException;

}
