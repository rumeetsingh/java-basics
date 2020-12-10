package com.company;

public class Main {

    public static void main(String[] args) {
	    var employee = new Employee();
	    employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        System.out.println(employee.calculateWage(10));
    }
}
