package Arrays;

public class SortedinAscendingOrder {
    public static void main(String[] args) {
        int[] nums ={1,3,2,4};
        boolean result = true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
