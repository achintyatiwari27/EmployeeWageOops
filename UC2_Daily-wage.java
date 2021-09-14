package com.BridgeLabz;

public class EmpWage {
    public static int check=(int)(Math.random()*2);
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation !");
        int check=(int)(Math.random()*2);
        EmployeePresentOrAbsent();
        dailyEmployeeWage();
    }

    private static void EmployeePresentOrAbsent() {
        System.out.println("\n Check whether the Employee present or absent:");

        if(check == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }

    public static void dailyEmployeeWage()
    {
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        System.out.println("\nCheck the employee daily wage:");
        int fullpresent = WAGE_PER_HOUR * FULL_DAY_HOUR;
        if (check == 1) {
            System.out.println("\n Employee is present for full day, the salary is " + fullpresent);
        } else
            System.out.println("\n  Employee is absent so there wil be no generation of salary");
    }
}



