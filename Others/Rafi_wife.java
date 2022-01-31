import java.util.Scanner;
public class Rafi_wife{
  public static void main (String agrs[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity of clothes");
    int l = sc.nextInt();
    System.out.println("Enter the quantity of lipstick");
    int e = sc.nextInt();
    System.out.println("Enter the quantity of makeup kit");
    int n = sc.nextInt();
    System.out.println("Enter the quantity of daimond ring");
    int x = sc.nextInt();
    int r = l*500;
    int a = e*99;
    int f = n*999;
    int i = x*700000;
    System.out.println("Total amount of clothes: "+r+"$ only");
    System.out.println("Total amount of lipstricks: "+a+"$ ektu besi");
    System.out.println("Total amount of makeup kits: "+f+"$ ar aktu besi");
    System.out.println("Total amount of daimond rings "+i+"$ o baba go");
    System.out.println("Your husband's fine is: "+(r+a+f+i+ "$ your hubby will be dead."));
  }
}