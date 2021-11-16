package src.main.java.com.solvd.university.computers;

public class Monitor {
    private String brand;
    private double size;
    private int serialNumber;
    
    public Monitor() {
    }

    public Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Monitor [brand=" + brand + ", serialNumber=" + serialNumber + ", size=" + size + "]";
    }

    
}
