package src.main.java.com.solvd.university;

import java.util.Date;

import src.main.java.com.solvd.university.classroom.Classroom;
import src.main.java.com.solvd.university.computers.Computer;
import src.main.java.com.solvd.university.educationalinstitution.University;
import src.main.java.com.solvd.university.persons.Rector;
import src.main.java.com.solvd.university.persons.Student;
import src.main.java.com.solvd.university.persons.Teacher;
import src.main.java.com.solvd.university.subjetcs.Enrollment;
import src.main.java.com.solvd.university.subjetcs.Subject;


public class App {
    public static void main(String[] args){
        
        Student ceci = new Student();//"Cecilia Kissner", new Date());
        
        Student juanma = new Student();//"Juan Martin Leg", new Date());
        
        ceci.setName("Cecilia Kissner");
        ceci.setRegisterDay(new Date());
        ceci.setGender("Female");
        ceci.grant(50);

        juanma.setName("Juan Martin Leg");
        juanma.setGender("Male");
        juanma.setRegisterDay(new Date());
        juanma.grant(100);
        juanma.likes("PlayGames");

        logger.log("Id "+ceci.getName()+ " is "+ceci.getIdStudent());
        logger.log("Id "+juanma.getName()+ " is "+juanma.getIdStudent());

        logger.log(ceci.toString());

        Teacher martin = new Teacher("Martin Leg", 150000);

        Classroom five = new Classroom(5);

        Subject java = new Subject();

        java.setIdSubject(10459);
        java.setName("Java Level 1");
        java.setTeacher(martin);
        java.setClassroom(five);
        java.setTotalHours(105);

        logger.log("The minimal grade to approve is "+java.printGrade());

        logger.log(java.toString());

        Enrollment javaclass = new Enrollment();

        javaclass.addStudent(ceci);
        javaclass.addStudent(juanma);

        Computer lab1 = new Computer();
        lab1.OP("Windows");

        University university1  = new University();

        university1.setName("Nacional de Mar del Plata");
        university1.setType("University");
        university1.setState("Buenos Aires");
        university1.setCity("Mar del Plata");
        logger.log(university1.toString());


        Rector someone = new Rector("Dima");
        someone.likes("Tennis");

        logger.log(someone.getName() + " " + someone.takeDecision("No more homeworks!!"));

    }
}
