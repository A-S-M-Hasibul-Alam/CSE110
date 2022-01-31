//import java.util.Scanner;
public class traslator{
  public static void main(String args[]){
    //Scanner sc = new Scanner(System.in);
    for(int c=1; c<=3; c++){
      for(int d=1; d<c; d++){
        System.out.print(" ");
      }
      for(int e=1; e<=6; e++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}