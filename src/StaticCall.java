
public class StaticCall {
    public static void main(String[] args)
    {
        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Student student = new Student();
        //student.grade = 3.5;
        System.out.println(student.grade);
    }
}
