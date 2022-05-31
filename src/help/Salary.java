package help;

public class Salary {
    public static void main (String []args){
        var employee = new Employee();
        employee.setBaseSalary(-1);
        employee.hourlyRate=20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
