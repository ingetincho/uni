package src.main.java.com.solvd.university.persons;

import java.util.Date;

public class Student extends Person implements Scholarship{
    private int idStudent;
    private static int idStudentCounter;
    private Date registerDay;
    private int scholarship;
    
    public Student(){
        this.idStudent = ++Student.idStudentCounter;
    }

    
    @Override
    public void grant(int percent) {
        
        this.scholarship=percent;
        
    }


    public void setStudentName(String name){
        super.setName(name);
    }

    public int getIdStudent() {
        return idStudent;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

    @Override
    public String toString() {
        return super.toString() + " Student [idStudent=" + idStudent + ", registerDay=" + registerDay + "]";
    }
 
        


}
