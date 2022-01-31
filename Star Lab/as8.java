import java.util.Scanner;
public class as8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int c = 1; c<=a; c++){
      for(int d =a-c; d>=1; d--){
        System.out.print(" ");
      }
      for(int e =1; e<=c; e++){
        System.out.print(e);
      }
      System.out.println();
    }
  }
}