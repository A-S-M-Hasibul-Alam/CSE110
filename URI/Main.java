import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = (c*15)/100;
    double e;
    e = b+d;
    System.out.printf("Total = R$ "+"%f",e);
  }
}
 