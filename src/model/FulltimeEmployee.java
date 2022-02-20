package model;

public class FulltimeEmployee extends Employee {
    private int bonus;
    private int fineMoney;
    private int baseSalary;

    @Override
    public double getNetSalary() {
        double result= getBaseSalary() + (getBonus()-getFineMoney());
        return result;
    }

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(int bonus, int fineMoney, int basicSalary) {
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = basicSalary;
    }

    public FulltimeEmployee(String employeeId, String fullName, int age, String phoneNumber, String email, int bonus, int fineMoney, int basicSalary) {
        super(employeeId, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = basicSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(int fineMoney) {
        this.fineMoney = fineMoney;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "FulltimeEmployee {" +
                "employeeID: "+super.getEmployeeId()+
                ", employeeName: "+super.getFullName()+
                ", age: "+super.getAge()+
                ", phoneNumber: "+super.getPhoneNumber()+
                ", email: "+super.getEmail()+
                ", bonus= " + bonus +
                ", fineMoney= " + fineMoney +
                ", baseSalary= " + baseSalary +
                ", finalSalary= "+getNetSalary() +
                '}';
    }
}
