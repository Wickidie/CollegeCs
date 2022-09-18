package maniparray;
public class ArrayData{
  static final int MAXDATA = 5;
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
  
  public boolean deleteData(String custName){
    int pos = -1;
    for (int i = 0; i < custSum; i++) {
      if (custName.compareToIgnoreCase(arr[i].getName()) == 0) {
        pos = i;
        break;
      }
    }
    if(pos == -1){
      return false;
    }
    if (pos == (custSum - 1)) {
      custSum--;
    }else{
      for (int i = pos; i < custSum-1; i++) {
        arr[i] = arr[i+1];
      }
      custSum--;
    }
    return true;
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
    for (int i = 1; i < arr.length; i++) {
      // System.out.println(i);
      // System.out.println(arr[i].getName());
      if (most.getBal() < arr[i].getBal()) {
        most = arr[i];
      }
    }
    return most;
  }

  public Customer longestName() {
    Customer longest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (longest.getName().length() < 
          arr[i].getName().length()) {
        longest = arr[i];
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