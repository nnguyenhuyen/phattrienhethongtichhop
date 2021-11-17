import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SServer {
    public static void main(String[] args) {
        try {
            Sstring ss=new Sstring();
            System.out.println("Khoi tao doi tuong");

            LocateRegistry.createRegistry(6060);
            Registry reg= LocateRegistry.getRegistry(6060);
            reg.bind("Calcula", ss);
            System.out.println("da dang ky doi tuong Calcula");
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
