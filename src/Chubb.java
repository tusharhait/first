import java.util.List;

public final class Chubb {
    public final List<String> stringList;

    Chubb(List<String> input){
        stringList=input;
    }

    public void getString(){
        stringList.forEach(System.out::println);
    }

    public List<String> getStringList(){
        return stringList;
    }
}
