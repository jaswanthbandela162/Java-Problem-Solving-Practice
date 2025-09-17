package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,4,3,7,2,9,10,6};
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    nums[j]=nums[j]*nums[j+1];
                    nums[j+1]=nums[j]/nums[j+1];
                    nums[j]=nums[j]/nums[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    
}
