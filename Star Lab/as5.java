import java.util.Scanner;
public class as5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int c = 1; c<=a; c++){
      for(int d =1; d<=c; d++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}