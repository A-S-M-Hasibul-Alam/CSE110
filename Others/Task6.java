import java.util.Scanner;
public class Task6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
  double a = sc.nextDouble();
  System.out.println("Enter another number");
  double b = sc.nextDouble();
  if(a>b){
    System.out.println("first is greater");
  }
  else{
    System.out.println("first is not greater");
  }
  }
}