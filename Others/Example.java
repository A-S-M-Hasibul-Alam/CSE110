import java.util.Scanner;
public class Example{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int num1 =  sc.nextInt();
    System.out.println("Enter another number");
    int num2 =  sc.nextInt();
    System.out.println("Enter another number");
    int num3 =  sc.nextInt();
    double sum = num1+num2+num3;
    double avg = sum/3;
    System.out.println(avg);
  }
}