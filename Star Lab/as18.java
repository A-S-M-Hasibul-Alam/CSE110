import java.util.Scanner;
public class as18{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = sc.nextInt();
    for(int i=1; i<=x; i++){
      for(int m=1; m<=x-i; m++){
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++){
        if(i==1 || i==x || j==1 || j==i){
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
    