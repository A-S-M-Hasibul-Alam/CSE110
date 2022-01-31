import java.util.Scanner;
public class as{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int c=1; c<=n-1; c++){
      for(int s = 1; s<=n-c; s++){
        System.out.print(" ");
      }
      for(int d=1; d<=2*c-1; d++){
        if(c==1 || d==1 || d==2*c-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    for(int e=n; e>=1; e--){
      for(int t = 1; t<=n-e; t++){
        System.out.print(" ");
      }
      for(int f=1; f<=2*e-1; f++){
        if(e==1 || f==1 || f==2*e-1){
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