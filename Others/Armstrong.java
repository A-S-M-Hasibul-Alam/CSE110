import java.util.Scanner;
public class Armstrong{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum = 0;
    int b = n;
    while(b>0){
      int a = b%10;
      sum = sum+a*a*a;
      b = b/10;
    }
    if(n == sum){
      System.out.println("It's an armstrong number");
    }
    else{
      System.out.println("It's not an armstrong number");
    }
  }
}

