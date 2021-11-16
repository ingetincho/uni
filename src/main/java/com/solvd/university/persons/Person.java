package src.main.java.com.solvd.university.persons;

public abstract class Person implements Hobbies{
    protected String name;
    protected String title;
    protected boolean active;
    protected String gender;
    protected int age;

    public Person(){
    }

    public Person(String name) {
        this.name = name;
    }

    
    @Override
    public String likes(String hobbies) {
        return hobbies;
    }

    public Person(String name, String title, Double salary, boolean active, String gender, int age) {
        this.name = name;
        this.title = title;
        this.active = active;
        this.gender = gender;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return super.toString()+" Person [active=" + active + ", age=" + age + ", gender=" + gender + ", name=" + name + ", title="
                + title + "]";
    }


    


}


