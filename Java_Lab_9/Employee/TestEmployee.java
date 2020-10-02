public class TestEmployee{
    public static void main(String[] args){
        Employee one = new Employee("Tom Daly", "Teacher", 45000f);
        Employee two = new Employee("Mary Murphy", "Developer", 30000f);
        Employee three = new Employee();

        System.out.println("Employee 2 is called "+two.getName());
        System.out.println("They are a " +two.getJobTitle());
        System.out.println("Their salary is " +two.getSalary());
        System.out.println("Their Employee ID number is " +two.getEmployeeID());

        three.setName("Michael Higgins");
        three.setJobTitle("President");
        three.setSalary(1000f);

        System.out.println();
        one.showEmp();
        System.out.println();
        two.showEmp();
        three.showEmp();
        System.out.println();
        System.out.println(one.toString());
    }
}
