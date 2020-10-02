public class Student{

    private String name;
    private String course;
    private int studentID;
    private static int id = 1000;

    public Student(){
        name = "<Undefined>";
        course = "<Undefined>";
        id++;
        studentID = id;
    }

    public Student(String name, String course){
        this.name = name;
        this.course = course;
        id++;
        this.studentID = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCourse(){
        return this.course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public void showStudent(){
        System.out.println("Name: "+this.name);
        System.out.println("Course: "+this.course);
        System.out.println("Student ID: "+this.studentID);
        System.out.println("---");
    }

}
