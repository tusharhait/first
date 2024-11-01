public class EmployeeObject {
    String name;
    String lastName;
    long salary;
    String address;
    String location;

    public EmployeeObject(String name, String address, String lastName, long salary, String location) {
        this.name = name;
        this.address = address;
        this.lastName = lastName;
        this.salary = salary;
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "EmployeeObject{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
