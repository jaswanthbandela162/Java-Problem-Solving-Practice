package Numbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
        System.out.println(isArmstrong(original, count));
    }

    public static boolean isArmstrong(int n, int count) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, count); 
            n = n / 10;
        }

        return sum == original;
    }
}
