package control;

import model.Employee;
import model.FulltimeEmployee;

import java.util.ArrayList;

public class Method {
    public static void displayEmployee(Employee[] employees){
        for (Employee e:employees
             ) {
            System.out.println(e);
        }
    }
    public static void addNewEmployee(Employee[] employees,
                                            Employee newEmployee, int minEmployee){
        for (int i = minEmployee; i <employees.length ; minEmployee++) {
            employees[minEmployee]=newEmployee;
            break;
        }
    }

}
