package maniparray;
public class ArrayData{
  static final int MAXDATA = 4;
  static int custSum = 0;

  Customer arr[] = new Customer[5];

  public void insertData(Customer cust) {
    if (custSum >= MAXDATA) {
      System.out.println("FULL TO ADD = " + custSum);
    }else{
      arr[custSum] = cust;
      custSum++;
      System.out.println(cust.getAll() + " Succes !");
    }
  }
  public void deleteData(int id){
    boolean status = false;
    int pos = -1;
    for (int i = 0; i < custSum; i++) {
      if (arr[i].getIDCust() == id) {
        status = true;
        break;
      }
    }
    if (status) {
      if (id == custSum) {
        custSum--;
      }else{
        for (int i = 0; i < custSum-1; i++) {
          
        }
      }
    }
  }

  public void printDataAll() {
    for (int i = 0; i < custSum; i++) {
      System.out.println(arr[i].getAll());
    }
  }
  public Customer printData(int index){
    return arr[index];
  }

  public int getCustSum() {
    return custSum;
  }

  public Customer topCustomerBal(){
    Customer most = arr[0];
    for (int i = 0; i < arr.length-2; i++) {
      if (arr[i].getBal() > arr[i+1].getBal()) {
        most = arr[i];
      }else{
        most = arr[i+1];
      }
    }
    return most;
  }
  public Customer longestName() {
    Customer longest = arr[0];
    for (int i = 0; i < arr.length-2; i++) {
      if (arr[i].getName().length() > 
          arr[i+1].getName().length()) {
        longest = arr[i];
      }else{
        longest = arr[i+1];
      }
    }
    return longest;
  }
  public Customer[] showCustomerAt(String address){
    int sameAdrs = 0;
    for (int i = 0; i < custSum; i++) {
      if (address.equalsIgnoreCase(arr[i].getAddress())) {
        sameAdrs++;
      }
    }
    Customer adrs[] = new Customer[sameAdrs];
    int j = 0;
    for (int i = 0; i < custSum; i++) {
      if (address.equalsIgnoreCase(arr[i].getAddress())) {
        adrs[j] = arr[i];
        j++;
      }
    }
    
    return adrs;
  }
  
}