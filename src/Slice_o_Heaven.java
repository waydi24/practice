public class Slice_o_Heaven {
    public String ostoreName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;

    private String Pizzalngredients;
    private double pizzaPrice;
    private int size;
    private String drinks;
    private String orderID;
    private double orderTotle;

    
    public void otakeorder(){
        
        System.out.println("Order is accepted");
        System.out.println("Order is being prepared");


        
    }

    public void makePizza(String lng,double Price,int si, String dr, String ID,double Totle){
        Pizzalngredients=lng;
        pizzaPrice=Price;
        size=si;
        drinks=dr;
        orderID=ID;
        orderTotle=Totle;
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("for pickup");
        }

        System.out.println("ready");
        printReceipt();

    }

    private void printReceipt(){
        System.out.println("*************Receipt*****************");
        System.out.println("ID "+orderID);
        System.out.println("size "+size);
        System.out.println("Pizzalngredients "+Pizzalngredients);
        System.out.println("pizzaprice "+pizzaPrice);
        System.out.println("drinks "+drinks);
        System.out.println("Totle "+orderTotle);



    }
}