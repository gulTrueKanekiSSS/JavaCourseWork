public class Main {

    private static Employee[] employees = new Employee[10];

    // for storing information employees
    public static void main(String[] args){
        employees[0] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 10000);
        employees[1] = new Employee("Dima", "Dmitriev", "Dmitrievich", 1, 20000);
        employees[2] = new Employee("Kirill", "Kirillov", "Kirillovich", 1, 13000);

        System.out.println("Employees:");

        for (Employee employee : employees) {
            if (employee != null){
                System.out.println(employee);
            }
        }
    }

    // for printing names of employees
    public static void printFullNamesEmployees(){
        System.out.println("Фамилия, Имя, Отчество всех сотрудников:");
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getSurname() + ", " + employee.getName() + ", " + employee.getLastname());
            }
        }
    }

    // for count employees in certain department
    public static int amountEmployeesInDepartment(int department){
        int result = 0;
        for (Employee employee : employees){
            if (employee.getDepartment() == department){
                result++;
            }
        }
        return result;
    }

    // for count sum of salaries' employees in all departments
    public static int getSumOfSalaryAllDepartment(){
        int result = 0;
        for (Employee employee : employees){
            if (employee != null){
                result += employee.getEmployeeSalary();
            }
        }
        return result;
    }

    // for count sum of salaries' employees in certain department
    public static int getSumOfSalaryInDepartment(int department){
        int result = 0;
        for (Employee employee : employees){
            if (employee != null){
                if (employee.getDepartment() == department){
                    result += employee.getEmployeeSalary();
                }
            }
        }
        return result;
    }

    // for find minimal salary
    public static Employee employeeWithMinSalary(){

        Employee empResult = null;
        for (Employee employee : employees){

            if (empResult == null) {
                empResult = employee;
            }

            else{
                if (empResult.getEmployeeSalary() > employee.getEmployeeSalary()){
                    empResult = employee;
                }
                else{
                    continue;
                }
            }
        }
        return empResult;
    }

    // for fiend the biggest salary
    public static Employee employeeWithMaxSalary(){
        Employee empResult = null;
        for (Employee employee : employees){

            if (empResult == null) {
                empResult = employee;
            }

            else{
                if (empResult.getEmployeeSalary() < employee.getEmployeeSalary()){
                    empResult = employee;
                }
                else{
                    continue;
                }
            }
        }
        return empResult;
    }

    // for count average salary in all departments
    public static int avgSalaryAllDepartments(){
        return getSumOfSalaryAllDepartment() / employees.length;
    }

    // for count average salary in certain department
    public static int avgSalaryInDepartment(int department){
        return getSumOfSalaryInDepartment(department) / amountEmployeesInDepartment(department);
    }


}
