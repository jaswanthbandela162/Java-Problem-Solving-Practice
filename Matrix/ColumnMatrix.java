package Matrix;

public class ColumnMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1},{2,3},{3}};
        boolean status = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length!=1){
                status = false;
            }
        }
        if(status){
            System.out.println("column matrix");
        }
        else{
            System.out.println("Not a column Matrix");
        }
    }
}
