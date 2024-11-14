import java.util.ArrayList;
import java.util.List;

public class Morgan2 {
    public static void main(String[] args){
        List<Integer> inputs = new ArrayList<>();
        int i =0;
        while(i<100){
            inputs.add(i);
            i++;
        }
        for(int j =0;j<inputs.size();j++){
            System.out.print(inputs.get(j)+" ");
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("ass");
        stringList.add("pass");
        Chubb chubb= new Chubb(stringList);
        chubb.getStringList().add("suvui");
        chubb.getString();
    }
}
