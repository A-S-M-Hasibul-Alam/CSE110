import java.util.Scanner;
public class T11{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another number");
    int b = sc.nextInt();
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println(a);
    System.out.println(b);
  }
}