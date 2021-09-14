package com.BridgeLabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation !");
        EmployeePresentOrAbsent();
    }

    private static void EmployeePresentOrAbsent() {
        int check=(int)(Math.random()*2);
        System.out.println("\n Check whether the Employee present or absent:");

        if(check == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}


