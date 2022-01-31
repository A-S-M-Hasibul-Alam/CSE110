import java.util.Scanner;
public class as25{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int counter=1; counter<=a; counter++){
      for(int d=a-counter; d>=1; d--){
        System.out.print(" ");
      }
      for(int c=1; c<=counter; c++){
        System.out.print(c);
      }
      for(int e = counter-1; e>=1; e--){
        System.out.print(e);
      }
      System.out.println();
    }
  }
}
