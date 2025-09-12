package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n=1;
        for(int i=1;i<=n;i++){
            int temp = nums[0];
            for(int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
