import java.util.Scanner;
public class pr28{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the quantity");
    int a = sc.nextInt();
    for(int i=1; i<=a; i++){
      System.out.println("Enter a number");
      int b = sc.nextInt();
      if(b%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
    }
  }
}