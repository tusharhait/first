import java.util.Arrays;

public class Counting {
    public static void main(String args[] ) throws Exception {
        int[] s = new int[]{4,6,9,3,2,2,0,7,5,3,1,5,4,6,2,4,6,8,9,0,0,7,4,5,3,7,2,1};
        int k = Arrays.stream(s).max().getAsInt();
        int[] count = new int[k+1];
        System.out.println(k+" "+s.length);
        for(int i=0;i<s.length;i++){
            count[s[i]]++;
        }
        for(int i =1;i<=k;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i: count){
            System.out.print(i+" ");
        }
        System.out.println("");
        int[] result = new int[s.length];
        for(int i = s.length-1;i>=0;i--){
            result[--count[s[i]]] = s[i];
        }
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
