
package ass4_creational_design_patterns;

public class TeachingAssistant_IT implements Staff{
    
    double Salary;
    int YearsOfWork;
    
    @Override
    public double GetSalary() {
        return Salary;
    }

    @Override
    public int GetYearsOfWork() {
        return YearsOfWork;
    }
}
