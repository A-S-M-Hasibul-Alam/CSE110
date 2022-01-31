import java.util.Scanner;
public class Task7{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    double a = sc.nextDouble();
    System.out.println("Enter another number");
    double b = sc.nextDouble();
    if(a>b){
      System.out.println("first is greater");
    }
    else{
      if(a == b){
        System.out.println("the numbers are equal");
      }
      else{
      System.out.println("second is greater");
      }
    }
  }
}