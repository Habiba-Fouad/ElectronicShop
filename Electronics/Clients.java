package Electronics;

public class Clients {
    private String clientName;
    private Orders orders;


    public Clients(String clientName, Orders orders) {
        this.clientName = clientName;
        this.orders = orders;

    }

    public Clients() {}

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public void total(Devices[] d){

        int totalLaptop = 0,totalMobile=0,totalSW=0;
        for (int i = 0; i <d.length; i++) {
            if(d[i].getDeviceName().equalsIgnoreCase("laptop")){
                totalLaptop+=d[i].getPrice();
            }
            else if(d[i].getDeviceName().equalsIgnoreCase("mobile")){
                totalMobile+=d[i].getPrice();
            }
            else {
                totalSW+=d[i].getPrice();
            }
        }
        orders.setTotal(totalLaptop+totalMobile+totalSW);
        System.out.println("your total amount = "+orders.getTotal()+","+totalLaptop+" for laptops"+" ,"+totalMobile+" for mobiles"+" ,"+totalSW+
                " ,for smart watches");
    }
}
