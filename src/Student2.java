public class Student2 {
    public static void main(String[] args)
    {
        Student2[] students = new Student2[100];
        System.out.println(students[0]);
        students[0] = new Student2();
        students[1] = new Student2();
        System.out.println(students[0]);
        System.out.println(students[1]);        
        //Student2 s1 = null;
        //Student2 s2;
        //s1.grade = 3.5;
        //students[0].grade = 3.5;
    }
    double grade;                                                                                                                                                                                           
    public void printGrade()
    {
        System.out.println(grade);
    }
}
