package com.company;

public class Programmer extends EmployeeFirm {
    public Programmer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Ivan", 77777, 2) {
            // @Override


        };

        System.out.println(programmer1.toGrade());
        System.out.println(programmer1.name);
        System.out.println(programmer1.newYear());
        System.out.println(programmer1.toGrade());
    }
}

