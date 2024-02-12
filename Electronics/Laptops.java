package Electronics;

public class Laptops extends Devices{
    private int ramSize;
    private int width;
    private int lapStorage;

    public Laptops(String deviceName,String modelName, int year,  int storage, int ramSize, int width,String color,int price) {
        super(deviceName,modelName, year, color, price);
        this.ramSize = ramSize;
        this.width = width;
        this.lapStorage=storage;

    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getLapStorage() {
        return lapStorage;
    }

    public void setLapStorage(int lapStorage) {
        this.lapStorage = lapStorage;
    }
    public void printFeatures(){
        System.out.println("A "+getDeviceName()+" and the storage = "+lapStorage+" ,Manufactured at "+getYear()+" and my color is "
                +getColor()+" with "+ramSize+" ram"+" and "+width+" inches"+" and the price = "+getPrice());

    }
}
