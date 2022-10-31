package kb2;

import java.util.Scanner;

class Main{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    LinkedlistCircular llc = new LinkedlistCircular();

    llc.insert(new Game("Dota", "Valve", 10));
    llc.insert(new Game("CSGO", "Valve", 20));
    llc.insert(new Game("TF2", "Valve", 50));
    llc.insert(new Game("L4D2", "Valve", 90));
    llc.insert(new Game("Zuma", "GameHouse", 169));
    
    llc.traverse();
    llc.remove();
    llc.traverse();

    System.out.println(llc.find("Zuma"));
    llc.modify("Zuma", "marvin", "Bali", 420);
    llc.traverse();
    System.out.println(llc.find("marvin"));
    llc.traverse();
    
    System.out.println(llc.find("Zuma"));
    llc.modify("Zuma", "marvin", "Bali", 420);
    llc.traverse();

    in.close();
  } 
}