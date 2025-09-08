package methods;

import java.util.Scanner;

public class Sunny {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isSunny(n));

    }
    public static boolean isSunny(int n){
        int num = n+1;
        for(int i = 1;i<=num;i++){
            if(i*i == num){
                return true;
            }
        } 
        return false;

    }
}
