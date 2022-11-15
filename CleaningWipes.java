import java.util.Scanner;

class CleaningWipes extends WetWipes {

  private String scent;
  private int countPerPack;
  private int length;
  private int width;
  private boolean safeForSkin;

  public CleaningWipes(){
    scent = "none";
    countPerPack = 10;
    length = 8;
    width = 6;
    safeForSkin = false;
  }

  public CleaningWipes(String newScent, int newCount, int newLength, int newWidth, boolean isSafe){
    super(newScent, newCount, newLength, newWidth);
    safeForSkin = isSafe;
  }

  public void modifyCount(Scanner input){
    input = new Scanner(System.in);
    System.out.println("Enter new count in pack: ");
    int countPerPack = input.nextInt();
    setCount(countPerPack);
  }

  public void setLength(int newLength){
    length = newLength;
  }

  public void setWidth(int newWidth){
    width = newWidth;
  }

  public void setCount(int newCount){
    countPerPack = newCount;
  }

  public String toString(){
    return "The new length is "+length+" and the new width is "+width;
  }

}