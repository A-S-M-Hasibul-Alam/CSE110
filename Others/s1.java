import java.util.Scanner;
public class s1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=1; b<=n; b++){
        if(a==1 || a==n){
          System.out.print("*");
        }
        else{
          System.out.print(b);
        }
      }
      System.out.println();
    }
  }
}