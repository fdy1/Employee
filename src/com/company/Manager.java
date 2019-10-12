package com.company;

public class Manager extends EmployeeFirm {


    public Manager(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager("Ivan", 65000, 2) {
           // @Override



        };f

System.out.println(manager1.toGrade());
System.out.println(manager1.name);
        System.out.println(manager1.newYear());
        System.out.println(manager1.toGrade());
    }
}
