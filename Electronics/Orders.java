package Electronics;

public class Orders {
    private int orderID;
    private int numberOfProducts;
    private int total=0;
    protected String [] deviceName;

    //private String employeeName;
    public Orders(int orderID, int numberOfProducts, String[] deviceName) {
        this.orderID = orderID;
        this.numberOfProducts = numberOfProducts;
        this.deviceName = deviceName;
    }

    public Orders() {}

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String[] getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String[] deviceName) {
        this.deviceName = deviceName;
    }
}
