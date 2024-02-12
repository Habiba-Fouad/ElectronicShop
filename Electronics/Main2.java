package Electronics;

public class Main2 {
    public static void main(String[] args) {

        Mobiles m = new Mobiles("mobile","Iphone",2024,265,"14Plus","pink",3,60000);
        Mobiles m2 = new Mobiles("mobile","Iphone",2023,265,"13","blue",2,45000);
        Laptops l = new Laptops("laptop","Mac Book 2",2022,500,16,18,"silver",25000);
        SmartWatch sw= new SmartWatch("smart watch","Smart watch2",2023,"rose gold",2,"S21",16000);
        Devices []d={m, m2, l, sw};
        Orders o = new Orders(1,4, new String[]{"laptop","mobile","mobile","smart watch"});
        Clients c = new Clients("Habiba",o);
        c.total(d);
    }

}
