package Arrays;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int[] nums = {5,7,9};
        processArray(nums);
    }

    public static void processArray(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        if (evenSum > oddSum) {
            int max = maxElement(arr);
            System.out.println("Max element: " + max);
        } else if (oddSum > evenSum) {
            int min = minElement(arr);
            System.out.println("Factors of " + min + ":");
            factors(min);
        } else {
            System.out.println("Is prime? " + isPrime(evenSum));
        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
