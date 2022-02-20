package model;

import model.Employee;

public class ParttimeEmployee extends Employee {
    public static final int SALARYPERHOUR = 100000;
    private double workHour;

    public ParttimeEmployee(double workHour){
        this.workHour=workHour;
    }

    @Override
    public double getNetSalary() {
        double result = workHour* SALARYPERHOUR;
        return result;
    }

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String employeeId, String fullName, int age,
                            String phoneNumber, String email,
                            double workHour) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee {" +
                "employeeID: "+super.getEmployeeId()+
                ", employeeName: "+super.getFullName()+
                ", age: "+super.getAge()+
                ", phoneNumber: "+super.getPhoneNumber()+
                ", email: "+super.getEmail()+
                ", workHour= " + workHour +
                ", finalSalary= "+getNetSalary()+
                '}';
    }
}
