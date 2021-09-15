import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int temp;
        boolean P=true;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số nguyên cần kiểm tra ");
        int num=sc.nextInt();
        sc.close();
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                P=false;
                break;
            }
        }
        if(P)
            System.out.println(num+ " Là số nguyên tố");
        else
            System.out.println(num+ " không là số nguyên tố");
    }
}
