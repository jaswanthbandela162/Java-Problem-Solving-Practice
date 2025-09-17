package Arrays;

public class LeftDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{11,2,9},{22,22,7},{33,2,33}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
