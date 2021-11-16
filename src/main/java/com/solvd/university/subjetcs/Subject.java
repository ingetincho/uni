package src.main.java.com.solvd.university.subjetcs;

import src.main.java.com.solvd.university.classroom.Classroom;
import src.main.java.com.solvd.university.persons.Teacher;

public class Subject implements Grades {
    private String name;
    private int idSubject;
    private int totalHours;
    private Classroom classroom;
    private Teacher teacher;

    public Subject(){

    }

    public Subject(String name, int idSubject, int totalHours, Classroom classroom, Teacher teacher) {
        this.name = name;
        this.idSubject = idSubject;
        this.totalHours = totalHours;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    @Override
    public double printGrade() {
        return GRADE;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject [classroom=" + classroom + ", idSubject=" + idSubject + ", name=" + name + ", teacher="
                + teacher + ", totalHours=" + totalHours + "]";
    }



}
