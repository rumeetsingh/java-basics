package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int noOfEmployees;

    // Constructor Overloading
    public Employee (int baseSalary,int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        noOfEmployees++;
    }
    public Employee (int baseSalary) {
        this(baseSalary,0);
    }

    public static int getNoOfEmployees() {
        return noOfEmployees;
    }

    // Method Overloading
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or negative.");
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate cannot be zero or negative.");
        this.hourlyRate = hourlyRate;
    }
}
