package src.main.java.com.solvd.university.computers;

public class Mouse extends InputDevices{
    private int serialNumber;
    private String type;    //wired, unwired, ps2, usb, etc

    public Mouse(String input, String brand) {
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


}
