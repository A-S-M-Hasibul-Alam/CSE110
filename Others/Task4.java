import java.util.Scanner;
public class Task4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of a circle");
    double r = sc.nextDouble();
    double cir = 2*3.1416*r;
    double area = 3.1416*r*r;
    System.out.println("Cir =" + cir);
    System.out.println("Area ="+ area);
  }
}