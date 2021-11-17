import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập n ");
        int n =sc.nextInt();
        double[] arr = new double[n];
        System.out.println("Nhập các phần tử của mảng ");
        for(int i=0;i<n;i++){
            System.out.printf("a[%d]= ",i);
            arr[i]= sc.nextDouble();

        }
        double s=0;
        for(int i=0; i<n;i++){
            if(arr[i]>0){
                s= s + arr[i];
            }
        }
        System.out.println("Tổng số dương là: " +s);
        }
        
}
