import java.util.Scanner;
public class st2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int max = a;
    int count = 1;
    while(count<3){
      System.out.println("Enter another number");
      int b = sc.nextInt();
      if(b>a){
        max = b;
      }
      count++;
    }
    System.out.println(max + " is the largest");
  }
}