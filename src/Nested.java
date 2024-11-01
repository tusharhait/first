import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nested {
    public static void main(String[] args){
        EmployeeObject employeeObject = new EmployeeObject("max","mumbai","anderson",1000,"400032");
        EmployeeObject employeeObject2 = new EmployeeObject("harsh","mumbai","patel",1000,"400032");
        EmployeeObject employeeObject3 = new EmployeeObject("harsh","bangalore","trax",10000,"400052");
        EmployeeObject employeeObject4 = new EmployeeObject("manual","delhi","jack",1500,"400062");
        EmployeeObject employeeObject5 = new EmployeeObject("patrick","kolkata","gonsalves",90000,"400072");

        List<EmployeeObject> employees = List.of(employeeObject,employeeObject2,employeeObject3,employeeObject4,employeeObject5);

        System.out.println(employees.stream().filter(e->e.getSalary()>10000).count());

        List<EmployeeObject> sortedEMployess=employees.stream().sorted((a,b)->(int)(a.getSalary()-b.getSalary())).collect(Collectors.toList());
        sortedEMployess.forEach(e->System.out.println(e.toString()));

    }

    public void compare(List<EmployeeObject> employeeObjects){
        for(int i =0; i<employeeObjects.size()-1;i++){
            EmployeeObject e1 = employeeObjects.get(i);
            EmployeeObject e2 = employeeObjects.get(i+1);
            boolean name,lastname,address,salary,location=true;
            if(!(e1.getName().equals(e2.getName()))){
                name=false;
            }
            if(!(e1.getLastName().equals(e2.getLastName()))){
                lastname=false;
            }
            if(e1.getSalary()!= e2.getSalary()){
                salary=false;
            }
            if(!(e1.getAddress().equals(e2.getAddress()))){
                address=false;
            }
            if(!(e1.getLocation().equals(e2.getLocation()))){
                location=false;
            }

        }
    }
}

//Node
//put--> hashocde, equals
//get--> hashcode
//class Custom{
//    int initialCapacity;
//
//    class Node{
//        Object key;
//        Object value;
//        int hashCode;
//        Node nextNode;
//    }
//
//    Custom(){
//        initialCapacity=16;
//    }
//
//    void put(Object Key, Object value){
//
//    }
//
//    Object get(Object key){
//
//    }
//
//    int hashCode{
//
//    }
//
//    boolean equals(Node input){
//        return this.Node.
//    }
//}
