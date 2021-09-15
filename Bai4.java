import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Nhập n: ");
       int n=sc.nextInt();
       int s=0;
       for(int i=1; i<=n;i++)
            s=s+i;
        System.out.println("Tổng là: " +s);
    }
}
