import java.util.Scanner;
public class pr23{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a;  n++){
      for(int m=1; m<=a-n; m++){
        System.out.print(" ");
      }
      for(int e=1; e<=n; e++){
        System.out.print(e);
      }
      for(int f=n-1; f>=1; f--){
        System.out.print(f);
      }
      System.out.println();
    }
  }
}