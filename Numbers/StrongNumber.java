package Numbers;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(strongNumber(123));
    }
    public static boolean strongNumber(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int fact = factorial(rem);
            sum= sum+fact;
            n=n/10;
        }
        return sum==original;
    }
    public static int factorial(int n){
        int product = 1;
        for(int i=n;i>0;i--){
            product=product*i;
        }
        return product;
    }
}
