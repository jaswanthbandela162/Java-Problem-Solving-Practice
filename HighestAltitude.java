public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] max = new int[gain.length+1];
        for(int i=0;i<gain.length;i++){
            max[i+1]=max[i] + gain[i];
        }
        int maxElement = max[0];
        for(int i=0;i<max.length;i++){
            if(max[i]>maxElement){
                maxElement=max[i];
            }
        }
        System.out.println("Maximum Altitude is:"+maxElement);
    }
}
