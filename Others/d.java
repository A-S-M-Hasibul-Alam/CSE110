import java.util.Scanner;
public class d{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int c=1; c<=n; c++){
      for(int s=n-c; s>=1; s--){
        System.out.print(" ");
      }
      for(int a=1; a<=(2*c-1); a++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}