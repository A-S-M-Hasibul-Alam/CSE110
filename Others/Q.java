import java.util.Scanner;
public class Q{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int s=n-a; s<=1; s--){
        System.out.print(" ");
      }
      for(int b=1; b<=a; b++){
        if(a==1 || a==n || b==1 || b==a){
          System.out.print(b);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
   