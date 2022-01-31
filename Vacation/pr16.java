import java.util.Scanner;
public class pr16{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int s=1; s<=a-n; s++){
        System.out.print(" ");
      }
      for(int m=1; m<=n; m++){
        if(n==1 || n==a || m==n || m==1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
