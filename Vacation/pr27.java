import java.util.Scanner;
public class pr27{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    for(int i=1; i<=20; i++){
      System.out.println("Enter a number");
      int a = sc.nextInt();
      if(a%2==0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
    }
  }
}