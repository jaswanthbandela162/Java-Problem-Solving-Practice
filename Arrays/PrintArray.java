package Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            if(nums.length-1==i){
                System.out.print(nums[i]);
            }
            else{
                System.out.print(nums[i]+",");
            }
        }
          System.out.print("]");
    }
}
