package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4};
        int[] result = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            boolean visit = false;
            for(int j=0;j<k;j++){
                if(nums[i]==result[j]){
                    visit = true;
                    break;
                }
            }
            if(!visit){
                result[k]=nums[i];
                k++;
            }
           
        }
        int[] unique = Arrays.copyOf(result, k);
        System.out.println(Arrays.toString(unique));
    }
}
