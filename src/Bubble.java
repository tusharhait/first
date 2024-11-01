public class Bubble {

    public static void main(String[] args){

        int[] s = new int[]{4,5,3,7,2,1};
        for(int i =0;i<s.length;i++){
            boolean happen = false;
            for(int j = i+1;j<s.length;j++){
                if(s[i]>s[j]){
                    int temp = s[i];
                    s[i]=s[j];
                    s[j]=temp;
                    happen=true;
                }
            }
            if(!happen){
                break;
            }
        }

        for(int i: s){
            System.out.print(i+" ");
        }

    }

}
