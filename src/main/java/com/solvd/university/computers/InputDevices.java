package src.main.java.com.solvd.university.computers;

public abstract class InputDevices {
    private String input;
    private String brand;

    protected InputDevices(String input,String brand){
        this.input=input;
        this.brand=brand;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InputDevices [brand=" + brand + ", input=" + input + "]";
    }

    
    

}
