package src.main.java.com.solvd.university.persons;

public class Teacher extends Person {
    
    private int idTeacher;
    private double salary;
    private static int teachercounter;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
        this.idTeacher=Teacher.teachercounter++;
    }

    public Teacher(){

    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getIdTeachar(){
        return this.idTeacher;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher [idTeacher=" + this.idTeacher + ", salary=" + this.salary + ", name=" + this.name + "]";
    }

    
}
