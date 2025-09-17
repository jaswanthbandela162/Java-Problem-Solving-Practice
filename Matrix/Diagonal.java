package Matrix;

public class Diagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},{0,2,0},{0,0,3}};
        boolean status = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=j){
                    if(arr[i][j]!=0){
                        status = false;
                    }
                }
            }
        }
        if(status){
            System.out.println("DiagonalMatrix");
        }
        else{
            System.out.println("Not a Diagonal Matrix");
        }
    }
}
