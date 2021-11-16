package src.main.java.com.solvd.university.subjetcs;

import src.main.java.com.solvd.university.persons.Student;

public class Enrollment {
    private int idSubject;
    private Student students[];
    private static int studentCounter;
    private int totalStudents;
    private static final int MAX_STUDENTS=15;

    public Enrollment(){
        this.totalStudents=++Enrollment.studentCounter;
        this.students = new Student[Enrollment.MAX_STUDENTS];
    }

    public void addStudent(Student student){
        if(this.studentCounter<MAX_STUDENTS){
            students[studentCounter++]=student;
            System.out.println("Se agrego a:  "+ student.getName());
        }
        else{
            System.out.println("Sorry, no more enrollments.");
        }    

    }

}
