import java.util.Scanner;
public class T12{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another number");
    int b = sc.nextInt();
    System.out.println("Enter another number");
    int c = sc.nextInt();
    a = a+b+c;
    b = a-b-c;
    c = a-b-c;
    a = a-b-c;
    System.out.println(b);
    System.out.println(c);
    System.out.println(a);
  }
}