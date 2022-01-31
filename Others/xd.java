import java.util.Scanner;
public class xd{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int start = n;
    for(int c=1; c<=n; c++){
      for(int d=1; d<=n-c; d++){
        System.out.print(" ");
      }
      for(int e=start; e<=n; e++){
        System.out.print(e);
      }
      System.out.println();
      start--;
    }
  }
}