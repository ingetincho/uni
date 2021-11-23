package src.main.java.com.solvd.university;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.logging.Logger;
/* import org.apache.log4j.Logger; */

import src.main.java.com.solvd.university.classroom.Classroom;
import src.main.java.com.solvd.university.computers.Computer;

import src.main.java.com.solvd.university.educationalinstitution.University;
import src.main.java.com.solvd.university.persons.Rector;
import src.main.java.com.solvd.university.persons.Student;
import src.main.java.com.solvd.university.persons.Teacher;
import src.main.java.com.solvd.university.subjetcs.Enrollment;
import src.main.java.com.solvd.university.subjetcs.Subject;

public class App {

  public static final Logger logger = Logger.getLogger(App.class.getName());

  static Set<University> uniList = new HashSet<>();

  public static void main(String[] args) {

    University university1 = new University();
    university1.setName("Nacional de Mar del Plata");
    university1.setType("University");
    university1.setState("Buenos Aires");
    university1.setCity("Mar del Plata");

    University university2 = new University();
    university2.setName("Nacional de Buenos Aires");

    logger.info(university2.toString());

    uniList.add(university1);   
    uniList.add(university2);


  /*   logger.info(uniList); */

    Student ceci = new Student();// "Cecilia Kissner", new Date());

    Student juanma = new Student();// "Juan Martin Leg", new Date());

    ceci.setName("Cecilia Kissner");
    ceci.setRegisterDay(new Date());
    ceci.setGender("Female");
    ceci.grant(50);

    juanma.setName("Juan Martin Leg");
    juanma.setGender("Male");
    juanma.setRegisterDay(new Date());
    juanma.grant(100);
    juanma.likes("PlayGames");
    
     logger.info("Id "+ceci.getName()+ " is "+ceci.getIdStudent());
     logger.info("Id "+juanma.getName()+ " is "+juanma.getIdStudent());
      
     logger.info(ceci.toString());
     

    Teacher martin = new Teacher("Martin Leg", 150000);

    Classroom five = new Classroom(5);

    Subject java = new Subject();

    java.setIdSubject(10459);
    java.setName("Java Level 1");
    java.setTeacher(martin);
    java.setClassroom(five);
    java.setTotalHours(105);

    /*
     * log.info("The minimal grade to approve is "+java.printGrade());
     * 
     * log.info(java.toString());
     */

    Enrollment javaclass = new Enrollment();

    javaclass.addStudent(ceci);
    javaclass.addStudent(juanma);

    Computer lab1 = new Computer();
    lab1.OP("Windows");

    /* log.info(university1.toString()); */

    Rector someone = new Rector("Dima");
    someone.likes("Tennis");

    /*
     * log.info(someone.getName() + " " +
     * someone.takeDecision("No more homeworks!!"));
     */

  }

}
