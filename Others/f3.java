import java.util.Scanner;
public class f3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a[] = {"Zero", "One", "Two", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine"};
    System.out.println("Enter a number");
    int n = sc.nextInt();
    System.out.println(a[n]);
  }
}