package Matrix;

public class ScalarMatrix {
   public static void main(String[] args) {
     int[][] arr = {{5,0,0},
                    {0,5,0},
                    {0,0,6}};
    int rows = arr.length;
    int cols = arr.length;
    int diagonalValue = arr[0][0];
    boolean isScalar = true;
    if(rows!=cols){
        System.out.println("Not a square matrix, so cannot be scalar...");
    }else{
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    if(arr[i][j]!=diagonalValue){
                        isScalar = false;
                        break;
                    }
                    }
                    else{
                        if(arr[i][j]!=0){
                            isScalar=false;
                            break;
                        }
                }
            }
        }
    }
    if(isScalar){
        System.out.println("The Matrix is Scalar");
    }
    else{
        System.out.println("Not a Scalar Matrix");
    }

   } 
}


