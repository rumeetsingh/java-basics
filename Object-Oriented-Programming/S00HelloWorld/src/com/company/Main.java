package com.company;

public class Main {
    public static void main(String[] args) {
	    var emp1 = new Employee(50_000,20);
        System.out.println(emp1.calculateWage(10));

        var emp2 = new Employee(20_000);
        System.out.println(emp2.calculateWage());

        System.out.println(Employee.getNoOfEmployees());
    }
}
