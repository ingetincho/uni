package src.main.java.com.solvd.university.computers;

public class KeyBoard extends InputDevices{
    private int serialNumber;
    private String type;
    
    public KeyBoard(String input, String brand) {
        super(input, brand);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "KeyBoard [serialNumber=" + serialNumber + ", type=" + type + "]";
    }

    
    
    
}
