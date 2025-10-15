class Student
{
    public String sname;
    public String usn;
    public String section;
    public int semester;


    public Student(String sname, String usn, String section, int semester)
    {
        this.sname=sname;
        this.usn=usn;
        this.section=section;
        this.semester=semester;
}

    public void display()
{
    System.out.println("Student name is " + sname);
    System.out.println("With USN "+usn);
    System.out.println("In Section "+section);
    System.out.println("and Semester "+ semester);}
}

public class StdInfo
{

    public static void main(String args[])
{
    Student std=new Student("Pranav", "1RUA24SCS0077", "B",3);
    std.display();
}
}