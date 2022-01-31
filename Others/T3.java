import java.util.Scanner;
public class T3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the width");
    double width = sc.nextDouble();
    System.out.println("Enter the height");
    double height = sc.nextDouble();
    double area = width*height;
    System.out.println(area);
  }
}