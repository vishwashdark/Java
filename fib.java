import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the end Number");
        int a=sc.nextInt();
        System.out.println("print number is "+a);
        int n1=0;
        int n2=1;
        int n3;
        System.out.println(n1+""+n2);
        for(int i=2;i<a;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
    }
}
