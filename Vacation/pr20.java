import java.util.Scanner;
public class pr20{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a-1; n++){
      for(int s=1; s<=a-n; s++){
        System.out.print(" ");
      }
      for(int b=1; b<=2*n-1; b++){
        if(n==1 || n==a || b==1 || b==2*n-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int m=a; m>=1; m--){
      for(int p=1; p<=a-m; p++){
        System.out.print(" ");
      }
      for(int c=1; c<=2*m-1; c++){
        if(m==1 || m==a || c==1 || c==2*m-1){
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
