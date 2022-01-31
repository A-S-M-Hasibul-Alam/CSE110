import java.util.Scanner;
public class as24{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int c=1; c<=a; c++){
      System.out.print(c);
    }
    for(int d = a-1; d>=1; d--){
      System.out.print(d);
    }
  }
}
