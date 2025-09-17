package Matrix;

public class NullMatrix {
    public static void main(String[] args) {
        int[][] arr = {{0,0},{0,1},{0,0}};
        boolean status = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    status = false;
                }
            }
        }
        if(status){
            System.out.println("Null Matrix");
        }
        else{
            System.out.println("Not a Null Matrix");
        }
    }
}
