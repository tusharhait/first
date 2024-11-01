//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    //In configuration i need to define a bean of resttemplate
//    //in pom xml i would need spring boot starter web
//    @Autowire
//    RestTemplate restTemplate;
//
//    //feign
//
//    //todo @Value
//    private String URL = "https://jsonplaceholder.typicode.com/users";
//
//    public List<Employee> fetchEmployee(){
//        HttpResponseEntity<List<Employee>> employess= restTemplate.getForEntity(url, List<Employee>.class);
//        if(employess.getHttpStatus().intValue()==200){
//            return employess.body();
//        }else{
//            //throw CustomException
//        }
//    }
//}
