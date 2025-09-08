import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] arr = new int[2][3];
        int[][] indices = {{0,1},{1,1}};
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<indices.length;i++){
            int r =  indices[i][0];
            int c = indices[i][1];

            for(int j=0;j<n;j++){
                arr[r][j]+=1;
            }
            for(int k=0;k<m;k++){
                arr[k][c]+=1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
