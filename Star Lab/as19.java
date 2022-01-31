import java.util.Scanner;
public class as19{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      int s;
      for(s=1; s<=n-a; s++){
        System.out.print(" ");
      }
      for(int x=s; x<=n; x++){
        if(x==n || x==s || a==n){
          System.out.print(x);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}