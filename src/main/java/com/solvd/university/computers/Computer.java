package src.main.java.com.solvd.university.computers;

public class Computer implements OperatingSystem{
    private String IPNumber;
    private String name;
    Monitor monitor;
    Mouse mouse;
    KeyBoard keyBoard;
    
    
    public Computer() {
    }


    public Computer(String name, Monitor monitor, Mouse mouse, KeyBoard keyBoard) {
        this.name = name;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyBoard = keyBoard;
    }

    

    @Override
    public String OP(String operatingSystem) {
        return "use " + operatingSystem;
    }


    public String getIPNumber() {
        return IPNumber;
    }


    public void setIPNumber(String iPNumber) {
        IPNumber = iPNumber;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Monitor getMonitor() {
        return monitor;
    }


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public Mouse getMouse() {
        return mouse;
    }


    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }


    public KeyBoard getKeyBoard() {
        return keyBoard;
    }


    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }


    @Override
    public String toString() {
        return "Computer [IPNumber=" + IPNumber + ", keyBoard=" + keyBoard + ", monitor=" + monitor + ", mouse=" + mouse
                + ", name=" + name + "]";
    }

    

    

}
