import java.util.Scanner;
public class T19{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    if(a%2==0){
      if(a%5==0){
        System.out.println(a);
      }
    }
  }
}