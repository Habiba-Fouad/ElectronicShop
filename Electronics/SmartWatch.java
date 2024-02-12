package Electronics;

public class SmartWatch extends Devices{
    int size;
    String type;

    public SmartWatch() {}

    public SmartWatch(String deviceName,String modelName, int year, String color, int size, String type,int price) {
        super(deviceName,modelName, year, color, price);
        this.size = size;
        this.type = type;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void printFeatures(){
        System.out.println("A "+getDeviceName()+" "+type+" ,Manufactured at "+getYear()+" and my size is "+size+" and my color is "
                +getColor()+" and the price = "+getPrice());

    }
}
