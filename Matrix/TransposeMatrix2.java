package Matrix;
public class TransposeMatrix2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] nums = new int[cols][rows];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("<<<<<<<<<<<<<<<<<<----------------------------------------------------------------->>>>>>>>>>>>>>");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
