import java.util.Scanner;
public class as16{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int c=1; c<=n; c++){
      for(int d=1; d<=c; d++){
        if(c==1 || c==n || d==1 || d==c){
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
          