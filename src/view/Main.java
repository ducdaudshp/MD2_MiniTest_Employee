package view;

import control.Method;
import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;



import java.util.Scanner;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int numberEmployee = input.nextInt();
        employees = new Employee[numberEmployee];
        int minEmployee =0;
        while (minEmployee<numberEmployee){
            System.out.println("1. Nhập nhân viên fulltime");
            System.out.println("2. Nhập nhân viên parttime");
            System.out.print("Chọn kiểu nhân viên muốn nhập: ");
            int typeEmployee = input.nextInt();
            input.nextLine();
            switch (typeEmployee){
                case 1:
                    System.out.print("Nhập mã nhân viên: ");
                    String fulltimeID= input.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    String fulltimeName=input.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    int fulltimeAge=input.nextInt();
                    input.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String fulltimePhoneNumber=input.nextLine();
                    System.out.print("Nhập Email: ");
                    String fulltimeEmail=input.nextLine();
                    System.out.print("Nhập số tiền phạt: ");
                    int fulltimeFine=input.nextInt();
                    System.out.print("Nhập số tiền thưởng: ");
                    int fulltimeBonus=input.nextInt();
                    System.out.print("Nhập lương cơ bản: ");
                    int fulltimeBase=input.nextInt();
                    FulltimeEmployee fulltimeEmployee = new FulltimeEmployee(fulltimeID,fulltimeName,fulltimeAge,fulltimePhoneNumber,
                            fulltimeEmail,fulltimeFine,fulltimeBonus,fulltimeBase);
                    Method.addNewEmployee(employees,fulltimeEmployee,minEmployee);
                    minEmployee++;
                    break;
                case 2:
                    System.out.print("Nhập mã nhân viên: ");
                    String partimeID= input.nextLine();
                    System.out.print("Nhập tên nhân viên: ");
                    String parttimeName=input.nextLine();
                    System.out.print("Nhập tuổi nhân viên: ");
                    int parttimeAge=input.nextInt();
                    input.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String parttimePhoneNumber=input.nextLine();
                    System.out.print("Nhập Email: ");
                    String parttimeEmail=input.nextLine();
                    System.out.print("Nhập số giờ làm việc: ");
                    double parttimeWorkHour=input.nextDouble();
                    ParttimeEmployee parttimeEmployee=new ParttimeEmployee(partimeID,parttimeName,
                            parttimeAge,parttimePhoneNumber,parttimeEmail,parttimeWorkHour);
                    Method.addNewEmployee(employees,parttimeEmployee,minEmployee);
                    minEmployee++;
                    break;
                default:
                    System.out.print("Chọn kiểu nhân viên muốn nhập: ");
            }
        }
        Method.displayEmployee(employees);
    }

}
