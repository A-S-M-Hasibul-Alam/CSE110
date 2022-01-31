import java.util.Scanner;
public class as11{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int start = a;
    for(int c = 1; c<=a; c++){
      for(int d =a-c; d>=1; d--){
        System.out.print(" ");
      }
      for(int e =start; e<=a; e++){
        System.out.print(e);
      }
      System.out.println();
      start--;
    }
  }
}