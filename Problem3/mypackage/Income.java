package mypackage;

public class Income
{
    private double salaryPerYear;

    public Income(double s){
        this.salaryPerYear = s;
    }

    public void setSalary(double s){
        this.salaryPerYear = s;
    }

    public double getSalary(){
        return this.salaryPerYear;
    }

    public String toString(){
        return this.salaryPerYear + "$";
    }
}

