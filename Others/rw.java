import java.util.Scanner;
public class rw{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=1; b<=n-a; b++){
        System.out.print(" ");
      }
      for(int z=1; z<=n; z++){
        if(z==1 || a==1 || a==n || z==n){
          System.out.print("*");
        }
        else{
          System.out.print("#");
        }
      }
    System.out.println();
    }
  }
}