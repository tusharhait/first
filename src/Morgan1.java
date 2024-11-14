public class Morgan1 {
    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5,6,7,8};
        int size=8;

        //System.out.println(Morgan1.consecutive(input,size));
        System.out.println(Morgan1.consecutiveAll(input,size));


    }

    public static int[][] consecutive(int[] input, int size){
        int[][] result=new int[input.length-size+1][size];
        for(int i=0;i<input.length;i++){
            if((i+size)<input.length){
                int j = 0;
                while(j<size){
                    result[i][j]=input[i+j];
                    j++;
                }
            }
        }
        return result;

    }

    public static int[][] consecutiveAll(int[] input, int size){
        int[][] result=new int[input.length-size+1][size];
//        for(int i=0;i<input.length;i++){
//            for(int j=1;j<size;j++){
//                if((i+size)<input.length){
//                    int k = 0;
//                    while(k<size){
//                        result[i][k]=input[i+k];
//                        k++;
//                    }
//                }
//            }
//        }
        for(int k=1;k<=size;k++){
            for(int i=0;i<input.length-k;i++){
//                if((i+k)<input.length){
                    int j = 0;
                    while(j<k){
                        //result[i][j]=input[i+j];
                        System.out.print(input[i+j]+" ");
                        j++;
                    }

                System.out.println();
            }
            System.out.println();
        }
        return result;

    }
}
