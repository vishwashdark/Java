import java.util.Scanner;
public class palindrome {
    static void checkpalindrome(String s){
        int n=s.length();
        String reverse = "";
        for(int i=n-1 ;i >=0;i--){
            reverse=reverse+s.charAt(i);
        }
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        checkpalindrome("racecar");
    }
}
