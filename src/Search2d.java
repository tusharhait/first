public class Search2d {
    public static void main(String[] args){
        int[][] matrix = new int[][] {
                {1,3}
        };
        /*  00 01 02
            10 11 12
            20 21 22*/
        int target = 3;
        for(int i =0;i< matrix.length;i++){
            if(matrix[i][0]<=target && target<=matrix[i][matrix.length]){
                int low=0;
                int high=matrix.length;
                while(low<=high){
                    int mid = low+(high-low)/2;
                    if(matrix[i][mid]==target){
                        System.out.println(i+"-"+mid);
                        break;
                    }
                    if(matrix[i][mid]<target){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }


        }
    }
}
