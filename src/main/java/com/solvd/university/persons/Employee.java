package src.main.java.com.solvd.university.persons;

public class Employee extends Person{
    private double salary;
    private String seccion;
    private int socialSecurityNumber;
    
    public Employee(String name, double salary, String seccion, int socialSecurityNumber) {
        super(name);
        this.salary = salary;
        this.seccion = seccion;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee [salary=" + salary + ", seccion=" + seccion + ", socialSecurityNumber=" + socialSecurityNumber
                + "]";
    }
   

}
