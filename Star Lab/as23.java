import java.util.Scanner;
public class as23{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=n-a; b>=1; b--){
        System.out.print(" ");
      }
      for(int c=1; c<=2*a-1; c++){
        if(c==1 || c==2*a-1 || a==1){
        System.out.print(c);
      }
      else{
        System.out.print(" ");
      }
    }
      System.out.println();
    }
    for(int d=n-1; d>=1; d--){
      for(int e=n-d; e>=1; e--){
        System.out.print(" ");
      }
      for(int f=1; f<=2*d-1; f++){
        if(f==1 || f==2*d-1){
        System.out.print(f);
      }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}    