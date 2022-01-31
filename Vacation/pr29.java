import java.util.Scanner;
public class pr29{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity");
    int a = sc.nextInt();
    System.out.println("Enter a number");
    double b = sc.nextInt();
    double sum = b;
    double max = b;
    double min = b;
    for(int i=1; i<=a-1; i++){
      System.out.println("Enter another number");
      double c = sc.nextInt();
      sum = sum+c;
      if(c>b){
        max = c;
      }
      if(c<b){
        min = c;
      }
    }
    double avg = sum/a;
    System.out.println(max);
    System.out.println(min);
    System.out.println(avg);
  }
}