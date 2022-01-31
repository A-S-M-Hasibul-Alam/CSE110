import java.util.Scanner;
public class a3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int max =a; int sum = a;
    for(int c =1; c<=19; c++){
      System.out.println("Enter another number");
      int b = sc.nextInt();
      if(b>a){
        max = b;
      }
      sum = sum+b;
    }
    System.out.println(max);
    double avg = sum/20;
    System.out.println(avg);
  }
}