import java.util.Scanner;
public class hw4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your grade on CSE");
    double a = sc.nextDouble();
    System.out.println("Enter your grade on Math");
    double b = sc.nextDouble();
    System.out.println("Enter your grade on Eng");
    double c = sc.nextDouble();
    System.out.println("Enter your grade on Physics");
    double d = sc.nextDouble();
    double CG = (a*3+b*3+c*0+d*3)/(3+3+0+3);
    System.out.println(CG);
  }
}