import java.util.Scanner;
public class pr31{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=a-1; i++){
      if(a%i==0){
        sum = sum+i;
      }
    }
    if(sum==a){
      System.out.println("Perfect");
    }
  }
}