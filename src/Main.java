import model.Employee;
import model.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int optionNumber = sc.nextInt();

        for (int i = 1; i <= optionNumber; i++) {
            sc.nextLine();
            System.out.printf("Employee #%d data:%n", i);
            System.out.print("Outsourced (y/n)? ");
            char charAt = sc.next().trim().toLowerCase().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hours: ");
            double valuePerHour = sc.nextDouble();
            if (charAt == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employeeList.add(new OutsourceEmployee(hours, name, valuePerHour, additionalCharge));
            } else {
                employeeList.add(new Employee(hours, name, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS");
        for (Employee e : employeeList) {
            System.out.printf("""
                    %s - $ %.2f
                    """, e.getName(), e.payment());
        }
    }
}