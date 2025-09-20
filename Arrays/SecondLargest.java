package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5,9,2};
        int firstmax = nums[0];
        int secondmax = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                firstmax=nums[i];
            }
        }
        System.out.println(firstmax);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=firstmax){
                if(nums[i]>secondmax){
                    secondmax=nums[i];
                }
            }
        }
        System.out.println(secondmax);
        int result = Math.min(firstmax, secondmax);
        System.out.println("Second Largest:"+result);
    }
}
