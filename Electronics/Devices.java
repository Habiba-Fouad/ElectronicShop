package Electronics;

public class Devices {
    private String deviceName;
    private String modelName;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    private int year;
    public static final String COMPANYNAME = "Apple";
    private String color;
    private int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Devices(String deviceName,String modelName, int year, String color, int price) {
        this.deviceName = deviceName;
        this.modelName = modelName;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public Devices() {}

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void printFeatures(){
        System.out.println("just a device");
    }
}
