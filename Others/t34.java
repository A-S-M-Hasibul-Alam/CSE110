import java.util.Scanner;
public class t34{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int b = a/4;
    int count = 1;
    int sum = 0;
    while(count<=b){
      int p = count*4;
      sum = sum+p;
      count++;
    }
    System.out.println(sum);
  }
}