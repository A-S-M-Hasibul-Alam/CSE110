import java.util.Scanner;
public class cf{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int a=1; a<=n; a++){
      for(int b=1; b<=n-a; b++){
        System.out.print(" ");
      }
      for(int c=1; c<=a; c++){
        System.out.print(c);
      }
      for(int d=a-1; d>=1; d--){
        System.out.print(d);
      }
      System.out.println();
    }
  }
}
