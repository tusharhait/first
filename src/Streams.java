//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Streams {
//
//    public static void main(String[] args){
//        List<EmployeeObject> employeeList = new ArrayList<EmployeeObject>();
//        employeeList.add(new EmployeeObject(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
//        employeeList.add(new EmployeeObject(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
//        employeeList.add(new EmployeeObject(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
//        employeeList.add(new EmployeeObject(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
//        employeeList.add(new EmployeeObject(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
//        employeeList.add(new EmployeeObject(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
//        employeeList.add(new EmployeeObject(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
//        employeeList.add(new EmployeeObject(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
//        employeeList.add(new EmployeeObject(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
//        employeeList.add(new EmployeeObject(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
//        employeeList.add(new EmployeeObject(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
//        employeeList.add(new EmployeeObject(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
//        // Sort above list in ascending order of employee's name
//        // List<Employee> newList = employeeList.stream().sorted((a,b)->a.getName()
//        // .compareTo(b.getName())).collect(Collectors.toList());
//        // for(Employee employee: newList){
//        //   System.out.println(employee.toString());
//        // }
//        String input = "Hello World";
//        // Calculate frequency of each character
//        char[] i1 = input.toCharArray();
//        employeeList.stream().collect(Collectors.groupingBy(e->e.getAge()));
//
//    }
//}
//
//class Employee {
//
//    private  int id;
//
//    private  String name;
//
//    int age;
//
//    String gender;
//
//    String department;
//
//    int yearOfJoining;
//
//    double salary;
//
//    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.department = department;
//        this.yearOfJoining = yearOfJoining;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public int getYearOfJoining() {
//        return yearOfJoining;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
//                + department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
//    }
//
//}
