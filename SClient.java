import java.nio.channels.NotYetBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class SClient {
    public static void main(String[] args) throws NotYetBoundException {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(6060);
            Numberinterface nb = (Numberinterface) reg.lookup("Calcula");
            Scanner sc = new Scanner(System.in);

            int chon;
            do {
                System.out.println(nb.Menu());
                chon = sc.nextInt();
                Chon(chon, nb);

            } while (chon != 0);

        } catch (Exception e) {
            // TODO: handle exception

        }
    }

    public static void Chon(int chon, Numberinterface nb) throws RemoteException {
        Scanner sc = new Scanner(System.in);
        switch (chon) {
        case 1:
            System.out.println("Nhap chuoi: ");
            String st = sc.nextLine();
            System.out.println("Ket qua: " + nb.demtu(st) + "\n");
            break;
        case 2:
            System.out.println("Nhap chuoi: ");
            String str = sc.nextLine();
            System.out.println("Ket qua: " + nb.daotu(str) + "\n");
            break;
        case 0:
            System.exit(0);
            break;
        default:
            System.out.println("Nhap sai!!\n");
            break;

        }
    }
}
