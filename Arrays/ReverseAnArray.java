package Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] result = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            result[result.length-1-i]=nums[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
