package help;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate*extraHours);
    }
    public void setBaseSalary(int baseSalary){
        if (baseSalary <=0)
            throw new IllegalArgumentException("salary can't be zero or negative");
        this.baseSalary = baseSalary;
    }
}
