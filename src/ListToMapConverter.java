//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@RestController
//public class ListToMapConverter {
//
//    @Autowire
//    EmployeeService employeeService;
//
//    @PostMapping()
//    public ResponseEntity<Map<Integer, Employee>> employeeProcess(@RequestBody List<Employee> employeesDetails){
//        //null check on employeeDetails throw error
//        employeesDetails =  employeeService.fetchEmployee();
//        Map<Integer, Employee> employeeMap= employeesDetails.stream().collect(Collectors.toMap(e->e.getId(),e->e));
//        return ResponseEntity.body(employeeMap).OK();
//    }
//
//}
