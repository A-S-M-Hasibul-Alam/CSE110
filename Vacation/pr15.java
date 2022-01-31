import java.util.Scanner;
public class pr15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int m=1; m<=n; m++){
        if(n==1 || n==a || n==m || m==1){
          System.out.print(m);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}