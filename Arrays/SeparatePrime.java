package Arrays;

import java.util.Arrays;

public class SeparatePrime {
    public static void main(String[] args) {
        int[] nums = {11,12,13,14,15,16,17,18,19};
        int Primecount = 0;
        int NonPrimecount = 0;
        for(int i=0;i<nums.length;i++){
            boolean primeNumber = isPrime(nums[i]);
            if(primeNumber){
                Primecount++;
            }
            else{
                NonPrimecount++;
            }
        }
        int[] primeArray = new int[Primecount];
        int[] NonPrimeArray = new int[NonPrimecount];
        int primeIndex =0;
        int NonPrimeIndex = 0;
        for(int i=0;i<nums.length;i++){
            boolean primeNumber = isPrime(nums[i]);
            if(primeNumber){
                primeArray[primeIndex]=nums[i];
                primeIndex++;
            }
            else{
                NonPrimeArray[NonPrimeIndex]=nums[i];
                NonPrimeIndex++;
            }
        }
        System.out.println(Arrays.toString(primeArray));
        System.out.println(Arrays.toString(NonPrimeArray));
    }
    public static boolean isPrime(int n){
            if (n <= 1) return false;       
            if (n == 2) return true;        
            if (n % 2 == 0) return false;   
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }
}
