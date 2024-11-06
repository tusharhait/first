import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public String[] generateBinary(int n){
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i =0;i<n;i++){
            result[i]=q.poll();
            String a1= result[i]+"0";
            String a2= result[i]+"1";
            q.offer(a1);
            q.offer(a2);
        }
        return result;
    }
}
