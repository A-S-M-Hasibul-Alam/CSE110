import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double av = (a+b)/2;
    System.out.printf("MEDIA = "+"%.2f",av);
  }
}