package com.BridgeLabz;

public class EmpWage {
    public static int check=(int)(Math.random()*3);
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation !");
        int check=(int)(Math.random()*3);
        EmployeePresentOrAbsent();
        dailyEmployeeWage();
    }

    private static void EmployeePresentOrAbsent() {
        System.out.println("\n Check whether the Employee present or absent:");

        if(check == 1)
            System.out.println("Employee is present");
        else if (check == 2)
            System.out.println("Employee is part time");
        else
            System.out.println("Employee is absent");
    }

    public static void dailyEmployeeWage() {
        int empHrs;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int PART_TIME_HOUR = 4;
        System.out.println("\nCheck the employee daily wage:");
        int fullpresent = WAGE_PER_HOUR * FULL_DAY_HOUR;
        int partTime = WAGE_PER_HOUR * PART_TIME_HOUR;
        switch (check) {
            case 1 :
                System.out.println("\n Employee is present for full day, the salary is " + fullpresent);
                check = 1;
                break;
            case 2 :
                System.out.println("\n  Employee is present part time, the salary is " + partTime);
                check = 2;
                break;
            default:
                System.out.println("Employee is absent so there wil be no generation of salary");
                empHrs = 0;
        }
    }
}



