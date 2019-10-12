

public abstract class EmployeeFirm {

    private String name;
    private int salary;
    private int grade;
    private int experience;

    public EmployeeFirm(String name, int salary, int experience) {
        System.out.println("Информация о работнике");
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    public int toGrade() {
        if (salary < 30000) {
            grade = 1;
        } else if (salary > 30000) {
            grade = 2;
        } else if (salary > 40000) {
            grade = 3;
        } else if (salary > 50000) {
            grade = 4;
        } else if (salary == 60000) {
            grade = 5;
        }
        return grade;
    }



}

