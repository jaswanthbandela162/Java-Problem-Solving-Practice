package Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int result = sumOfElements(nums);
        System.out.println(result);
    }
    public static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
