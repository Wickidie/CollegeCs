package inventory;

public class Product {
    private int number;
    private String name;
    private int qty;
    private double price;
    private boolean status;

    public Product(){
        number = 0;
        name = "";
        qty = 0;
        price = .0;
    }
    public Product(int number, String name, int qty, double price){
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name ) {
        this.name = name;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }
    public boolean isStatus() {
    
        return status;
    }
    public double getInventoryValue() {
        return getQty() * getPrice();
    }

    @Override
    public String toString() {
        System.out.println("Item Number : " + getNumber());
        System.out.println("Name : " + getName());
        System.out.println("Quantity in stock : " + getQty());
        System.out.println("Price : " + getPrice());
        System.out.println("Stock Value : " + getInventoryValue());
        System.out.print("Product Status : ");
        if (isStatus()) {
            System.out.println("Active");
        }else{
            System.out.println("Discontinued");
        }
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "\n";
    }
    



}
