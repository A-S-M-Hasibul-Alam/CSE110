import java.util.Scanner;
public class pr19{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int s=1; s<=a-n; s++){
        System.out.print(" ");
      }
      for(int b=1; b<=2*n-1; b++){
        if(n==1 || n==a || b==1 || b==2*n-1){
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
