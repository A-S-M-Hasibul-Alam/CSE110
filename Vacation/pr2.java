import java.util.Scanner;
public class pr2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int a = sc.nextInt();
    System.out.println("Enter coloumn number");
    int b = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int m=1; m<=b; m++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
