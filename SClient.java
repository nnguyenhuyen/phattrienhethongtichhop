
import java.io.IOException;

import java.nio.channels.NotYetBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.util.Scanner;



public class SClient {
    public static void main(String[] args) throws NotYetBoundException{
        Registry reg;
        try {
            reg=LocateRegistry.getRegistry(6060);
            Numberinterface nb=(Numberinterface) reg.lookup("Calcula");
            Scanner sc=new Scanner(System.in);
         
            int chon;
            do{
                System.out.println(nb.Menu());
                chon=sc.nextInt();
                Chon(chon, nb);

            }while(chon!=0);
        
            
            
            
        } catch (Exception e) {
            //TODO: handle exception
            
        }
    }
    public static void Chon(int chon, Numberinterface nb) throws Exception{
        Scanner sc= new Scanner(System.in);
        //System.out.println("Nhap chuoi: ");
        //String st=sc.nextLine();
        switch (chon) {
            case 1:
                System.out.println("Nhap chuoi: ");
                String st=sc.nextLine();
                System.out.println("Ket qua: "+nb.demtu(st)+"\n");
                break;
            case 2:
                System.out.println("Nhap chuoi: ");
                
                String str=sc.nextLine();
                System.out.println("Ket qua: "+nb.daotu(str)+"\n");
                break;
            case 3:
                System.out.println("nhap chuoi: ");
                String t=sc.nextLine();
                System.out.println("ket qua: "+ nb.chuan(t)+"\n");

                break;
            case 4:
                System.out.println("nhap chuoi: ");
                String tt=sc.nextLine();
                System.out.println("ket qua: "+ nb.inhoa(tt)+"\n");
                break;
            case 5:
                System.out.println("nhap chuoi: ");
                String nt=sc.nextLine();
                System.out.println("ket qua: "+ nb.inthuong(nt)+"\n");
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
