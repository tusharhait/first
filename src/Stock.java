import java.util.List;

public class Stock {

    public static void main(String[] args){
        //List<Integer> stockPrices = {20,30,50,90,120,70,100,160,140}
        List<Integer> stockPrice = List.of(20,30,50,90,120,70,100,160,140);
        System.out.println(Stock.maxProfit(stockPrice));
    }

    public static long maxProfit(List<Integer> input){
        int i = 0;
        int j = 1;
        long max =0;
        long current = 0;
        while(j<input.size()){
            if(input.get(i)<input.get(j)){
                long diff = input.get(j)-input.get(i);
                current = Math.max(current,diff);
                j++;
            }else{
                max+=current;
                i=j;
                j++;
                current = 0;
            }
        }
        return max;

    }
}
