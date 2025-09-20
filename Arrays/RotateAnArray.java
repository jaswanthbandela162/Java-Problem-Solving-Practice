package Arrays;
import java.util.Arrays;
public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        for(int i=0;i<k;i++){
            int temp = nums[0];
            for(int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];
            }
            nums[nums.length-1]= temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
