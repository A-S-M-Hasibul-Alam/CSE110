import java.util.Scanner;
public class cdm{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an angel");
    double n = sc.nextInt();
    System.out.printf("%.4f",Math.sin(Math.toRadians(n)));
  }
}