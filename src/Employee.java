import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String lastname;
    private int department;
    private int employeeSalary;

    private static int idCounter  = 0;
    private final int idEmployee;

    // getter for name field
    public String getName() {
        return name;
    }

    // setter for name field
    public void setName(String name){
        this.name = name;
    }

    // getter for surname field
    public String getSurname(){
        return surname;
    }

    // setter for surname field
    public void setSurname(String surname){
        this.surname = surname;
    }

    // getter for lastname field
    public String getLastname(){
        return lastname;
    }

    // setter for lastname field
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // getter for department field
    public int getDepartment(){
        return department;
    }

    // setter for department field
    public void setDepartment(int department){
        this.department = department;
    }

    // getter for salary field
    public int getEmployeeSalary(){
        return employeeSalary;
    }

    //setter for salary field
    public void setEmployeeSalary(int employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    // constructor for Employee class
    public Employee(String name, String surname, String lastname, int department, int employeeSalary){
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.department = department;
        this.employeeSalary = employeeSalary;

        this.idEmployee = idCounter++;
    }

    //to display information about an employee
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

    // equals contract
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

    // hashCode contract
    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }


}
