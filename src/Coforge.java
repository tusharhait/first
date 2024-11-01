import java.util.List;
import java.util.stream.Collectors;

public class Coforge {

    //input: 2,0,7,1,8,0,2,0,5,3,0
    //output : 2,7,1,8,2,5,3,0,0,0,0
    public static void main(String[] args){
        List<Integer> input = List.of(2,0,7,1,8,0,2,0,5,3,0);
        List<Integer> withoutZeros= input.stream().filter(e->e!=0).collect(Collectors.toList());
        int sizeOfZeros = input.size()- withoutZeros.size();
        int i =0;
        while(i<sizeOfZeros){
            withoutZeros.add(0);
            i++;
        }
        withoutZeros.forEach(System.out::print);

    }
}
