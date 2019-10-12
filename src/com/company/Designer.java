package com.company;

public class Designer extends EmployeeFirm {
    public Designer(String name, int salary, int experience) {
        super(name, salary, experience);
    }

    public static void main(String[] args) {
        Designer designer1 = new Designer("Ivan", 65000, 2) {
            // @Override


        };

        System.out.println(designer1.toGrade());
        System.out.println(designer1.name);
        System.out.println(designer1.newYear());
        System.out.println(designer1.toGrade());
    }
}
