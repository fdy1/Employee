package com.company;

public abstract class EmployeeFirm {
    int percentage = 10;
    public String name;
    public int salary;

    public int experience;

    public EmployeeFirm(String name, int salary, int experience) {
        System.out.println("Информация о работнике");
        this.name = name;
        this.salary = salary;
        this.experience = experience;

    }
    public  int toGrade() {
        int grade = 0;
        if (salary <= 30000) {
            grade = 1;
        } else if (salary <= 50000) {
            grade = 2;
        } else if (salary <= 60000) {
            grade = 3;
        } else if (salary <= 70000) {
            grade = 4;
        } else if (salary <= 80000) {
            grade = 5;
        }
        return grade;
    }
    public int newYear() {
        percentage = (salary/100 * percentage);
        salary +=percentage;
        return salary;
    }



}

