import java.util.Scanner;
public class pr22{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      System.out.print(n);
    }
    for(int m=a-1; m>=1; m--){
      System.out.print(m);
    }
  }
}