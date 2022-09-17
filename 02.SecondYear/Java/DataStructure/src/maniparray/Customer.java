package maniparray;
public class Customer{
  private int IDCust;
  private int Balance;
  private String Name;
  private String Address;

  public Customer(int id, int bal, String name, String address){
    IDCust = id;
    Balance = bal;
    Name = name;
    Address = address;
  }
  public void setCustomerData(int id, int bal, String name, String address){
    IDCust = id;
    Balance = bal;
    Name = name;
    Address = address;
  }

  public int getIDCust(){
    return IDCust;
  }
  public int getBal(){
    return Balance;
  }
  public String getAddress(){
    return Address;
  }
  public String getName(){
    return Name;
  }
  public String getAll() {
    return 
    String.valueOf(IDCust) + " " + 
    String.valueOf(Balance) + " " +
    Name + " " + 
    Address;
  }
  
}