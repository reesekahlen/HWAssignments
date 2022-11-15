import java.util.Scanner;

class WetWipes {

  private String scent;
  private int countPerPack;
  private int length;
  private int width;

  public WetWipes(){
    scent = "unscented";
    countPerPack = 10;
    length = 8;
    width = 6;
  }

  public WetWipes(String newScent, int newCount, int newLength, int newWidth){
    scent = newScent;
    countPerPack = newCount;
    length = newLength;
    width = newWidth;
  }

  public String getScent(){
    return scent;
  }

  public int getCount(){
    return countPerPack;
  }

  public int getVolume(){
    return (countPerPack*length*width);
  }

  public void setCount(int newCount){
    countPerPack = newCount;
  }

  public void modifyCount(Scanner input){
    input = new Scanner(System.in);
    System.out.println("Enter new count in pack: ");
    int countPerPack = input.nextInt();
    setCount(countPerPack);
  }
  
}