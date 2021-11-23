package src.main.java.com.solvd.university.exeptions;

public class ClassroomIsFull extends RuntimeException{
    
    public ClassroomIsFull(String message){
        super(message);
    }
}
