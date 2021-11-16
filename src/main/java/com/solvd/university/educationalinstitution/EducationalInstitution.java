package src.main.java.com.solvd.university.educationalinstitution;


public abstract class EducationalInstitution {
    private String type;
    private String city;
    private String state;
    private String name;
    
    public EducationalInstitution() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EducationalInstitution [city=" + city + ", name=" + name + ", state=" + state + ", type=" + type + "]";
    }

    

}
