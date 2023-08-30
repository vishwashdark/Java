import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number to check prime or not");
        int a=sc.nextInt();
        int d=a/2;
        if(d==0 || d==1){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not  a prime number");
        }
    }
}
