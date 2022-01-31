import java.util.Scanner;
public class s{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scn.nextInt();
    for(int c=a; c>=1; c--){
      for(int d=a-c; d<=1; d++){
        System.out.print(" ");
      }
      for(int e=1; e<=2*c-1; e++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}