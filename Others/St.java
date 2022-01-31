import java.util.Scanner;
public class St{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=1; b<=n-a; b++){
        System.out.print(" ");
      }
      for(int c=1; c<=2*a-1; c++){
        if(c==1 || c==2*a-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int d=n-1; d>=1; d--){
      for(int e=1; e<=n-d; e++){
        System.out.print(" ");
      }
      for(int f=1; f<=2*d-1; f++){
        if(f==1 || f==2*d-1){
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
