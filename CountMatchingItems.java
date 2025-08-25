import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchingItems {
    public static void main(String[] args) {
        List<List<String>> l = new ArrayList<>();
        l.add(new ArrayList<>(Arrays.asList("phone", "silver", "iphone")));
        l.add(new ArrayList<>(Arrays.asList("mobile", "red", "android")));
        String ruleKey = "type";
        String ruleValue = "phone";
        int count = 0;
        int indexMap = 0;
        if(ruleKey.equals("color")){
            indexMap=1;
        }
        else if(ruleKey.equals("name")){
            indexMap=2;
        }
        else{
            indexMap = 0;
        }
        for(int i=0;i<l.size();i++){
            if(l.get(i).get(indexMap).equals(ruleValue)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
