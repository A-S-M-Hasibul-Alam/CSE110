import java.util.Scanner;
public class Stationery{
  public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of oranges");
    double or = sc.nextDouble();
    System.out.println("Enter the number of lemons");
    double le = sc.nextDouble();
    double Sum = or*30 + le*15;
    System.out.println(Sum);
  }
}
    