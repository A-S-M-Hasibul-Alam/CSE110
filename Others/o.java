import java.util.Scanner;
public class o{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=n-a; b>=1; b--){
        System.out.print(" ");
      }
      for(int c=1; c<=2*a-1; c++){
        if(c==1 || c==2*a-1 || a==1){
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