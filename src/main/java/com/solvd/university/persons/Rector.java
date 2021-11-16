package src.main.java.com.solvd.university.persons;

public class Rector extends Person implements Ejecutive{

    @Override
    public String takeDecision(String decision) {
        return "Wants to implement "+ decision;
    }

    

    public Rector(String name) {
        super(name);
    }


    
    
}
