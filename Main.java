import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    
    CleaningWipes myWipes = new CleaningWipes("citrus",20,5,7,true);

    System.out.println("The scent of the wipes are: "+myWipes.getScent());
    System.out.println("The count of the pack of wipes is "+ myWipes.getCount());
    System.out.println("The volume of the pack of wipes is "+ myWipes.getVolume());

    myWipes.setLength(8);
    myWipes.setWidth(6);

    System.out.println(myWipes.toString());

    myWipes.modifyCount(myScanner);

    
  }
}