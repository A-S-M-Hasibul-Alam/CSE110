import java.util.Scanner;
public class pr12{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int r = sc.nextInt();
    System.out.println("Enter coloumn number");
    int c = sc.nextInt();
    for(int n=1; n<=r; n++){
      for(int m=1; m<=c; m++){
        if(n==1 || n==r || m==1 || m==c){
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