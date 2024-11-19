import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String lastname;
    private int department;
    private int employeeSalary;

    private static int idCounter  = 0;
    private final int idEmployee;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDepartment(){
        return department;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public int getEmployeeSalary(){
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public Employee(String name, String surname, String lastname, int department, int employeeSalary){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.department = department;
        this.employeeSalary = employeeSalary;

        this.idEmployee = idCounter++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idEmployee +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department=" + department +
                ", salary=" + employeeSalary +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Employee otherEmp = (Employee) o;

        return Objects.equals(name, otherEmp.name) &&
                Objects.equals(surname, otherEmp.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }


}
