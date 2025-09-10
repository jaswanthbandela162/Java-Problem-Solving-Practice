package Arrays;

public class SumOfEvenElements {
    public static void main(String[] args) {
        int[] nums = {2,3};
        int result = sumOfEvenElements(nums);
        System.out.println(result);
    }
    public static int sumOfEvenElements(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            boolean even = isEven(arr[i]);
            if(even){
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}
