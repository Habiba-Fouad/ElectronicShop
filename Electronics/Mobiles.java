package Electronics;

public class Mobiles extends Devices{

    private String type;
    private int mobileStorage;
    private int cameraNumber;

    public int getCameraNumber() {
        return cameraNumber;
    }

    public void setCameraNumber(int cameraNumber) {
        this.cameraNumber = cameraNumber;
    }


    public Mobiles(String deviceName,String modelName, int year, int storage, String type, String color, int cameraNumber, int price) {
        super(deviceName,modelName, year, color, price);
        this.type = type;
        this.mobileStorage=storage;
        this.cameraNumber = cameraNumber;

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getMobileStorage() {
        return mobileStorage;
    }

    public void setMobileStorage(int mobileStorage) {
        this.mobileStorage = mobileStorage;
    }
    public void printFeatures(){
        System.out.println("An "+getDeviceName()+" "+type+" and the storage = "+mobileStorage+" ,Manufactured at "+getYear()+" and my color is "
                +getColor()+" with "+cameraNumber+" cameras"+" and the price = "+getPrice());

    }
}
