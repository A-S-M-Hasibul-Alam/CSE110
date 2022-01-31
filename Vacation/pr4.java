import java.util.Scanner;
public class pr4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int m=1; m<=n; m++){
        System.out.print(m);
      }
      System.out.println();
    }
  }
}