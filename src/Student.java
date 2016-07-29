
public class Student {
    public static void main(String[] args)
    {
        //grade = 3.5;
        //printGrade();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.grade = 4.00;
        student2.grade = 3.00;
        student3.grade = 2.01;
        student1.printGrade();
        student2.printGrade();
        student3.printGrade();
    }
    double grade;
    public void printGrade()
    {
        System.out.println(grade);
    }
}
