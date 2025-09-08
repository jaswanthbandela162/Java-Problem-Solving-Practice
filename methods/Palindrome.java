package methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        
    }
    public static boolean isPalindrome(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum * 10 + rem;
            n=n/10;
        }
        return sum == original;
    }
    
}
