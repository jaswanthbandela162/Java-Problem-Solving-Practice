package Arrays;

public class LargestElement {
    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] nums){
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
            min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] nums = {3,1,4,1,5,9};
        int max = maximum(nums);
        int min = minimum(nums);
        System.out.println(min);
        System.out.println(max);
    }
}
