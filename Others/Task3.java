import java.util.Scanner;
public class Task3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    double a = sc.nextDouble();
    System.out.println("Enter another number");
    double b = sc.nextDouble();
    double sum = a+b;
    double prod = a*b;
    double dif = a-b;
    System.out.println(sum+" "+ prod+" "+ dif);
  }
}
  