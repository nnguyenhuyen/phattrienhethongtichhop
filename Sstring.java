import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.StringTokenizer;

public class Sstring extends UnicastRemoteObject implements Numberinterface {
    protected Sstring() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

    public int demtu(String st) throws RemoteException {

        StringTokenizer sto = new StringTokenizer(st);
        int sotu = sto.countTokens();
        return sotu;
    }

    public String daotu(String str) throws RemoteException {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();

    }

    public String Menu() throws RemoteException {
        return "1. Dem so luong tu\n" + "2.Dao nguoc chuoi\n" + "Nhap lua chon: ";
    }

}
