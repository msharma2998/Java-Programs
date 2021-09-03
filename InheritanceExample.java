class Person
{
    public String name="Mansi";
    public int age=23;

    //protected keyword restricts the access of this function only to subclasses of this class
    protected void getPerson()
    {
        System.out.println(name+" is "+age+" years old.");
    }
}

class Student extends Person
{
    public int Rollno=201;
    public void getStudent()
    {
        System.out.println("Student named "+name+" is "+age+" years old and has roll no = "+Rollno);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getPerson();
        s1.getStudent();
    }
}
