package Matrix;

public class MatrixSubtraction {
    public static void main(String[] args) {
         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{1,2,3},{4,5,6},{6,7,8}};
        int[][] nums = new int[3][3];        
       if(arr.length==arr1.length&&arr[0].length==arr1[0].length){
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                nums[i][j]=arr[i][j]-arr1[i][j];
            }
        }
    
        for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums[i].length;j++){
            System.out.print(nums[i][j]+" ");
        }
        System.out.println();
        }
     }
     else{
        System.out.println("Not Possible");
     }
    }
}
