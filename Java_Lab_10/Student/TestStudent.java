public class TestStudent{
    public static void main(String[] args){

        Student zero = new Student("Jacob Gallagher", "Biotechnology");
        Student one = new Student("Frank Simons", "CSSE");
        Student two = new Student("Louise Johnsen", "Computational Thinking");

        Student student [] = new Student[3];
        student[0] = zero;
        student[1] = one;
        student[2] = two;

        for(int i=0; i<student.length; i++){
            student[i].showStudent();
        }

        student[0].setCourse("CSSE");
        student[0].showStudent(); 
        student[2].setName("Louise Johnson");
        System.out.println(student[2].getName());

    }
}