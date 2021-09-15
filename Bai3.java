import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a=sc.nextFloat();
        System.out.println("Nhập b: ");
        float b=sc.nextFloat();
        System.out.println("Nhập c: ");
        float c=sc.nextFloat();
        if(a==0){
            if(b!=0)
                System.out.println("Phương trình có 1 nghiệm :x= "+(-c/b));
            else
                System.out.println(("Phương trình vô nghiệm"));
        }
        else{
            float d=b*b-4*a*c;
            float x1;
            float x2;
            if(d>0){
               x1=(float)((-b+Math.sqrt(d))/(2*a));
               x2=(float)((-b-Math.sqrt(d))/(2*a));
               System.out.println("Phương trình có 2 nghiệm x1= "+x1+ " và x2= " +x2);

            }
            else if(d==0){
                    x1=(-b/(2*a));
                    System.out.println("Phương trình có nghiệm kép x1=x2= " +x1);}
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
