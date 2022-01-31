import java.util.Scanner;
public class a16{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int max =a; int min=a; int sum = a;
    for(int c =1; c<=9; c++){
      System.out.println("Enter another number");
      int b = sc.nextInt();
      if(b>a){
        max = b;
      }
      if(a>b){
        min=b;
      }
      sum = sum+b;
    }
    System.out.println(max);
    System.out.println(min);
    double avg = sum/10;
    System.out.println(avg);
  }
}