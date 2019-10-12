package com.company;

public class Analyst extends EmployeeFirm {
    public Analyst(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public static void main(String[] args) {
        Analyst analyst1 = new Analyst("Ivan", 65000, 2) {
            // @Override


        };

        System.out.println(analyst1.toGrade());
        System.out.println(analyst1.name);
        System.out.println(analyst1.newYear());
        System.out.println(analyst1.toGrade());
    }
}
