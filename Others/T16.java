import java.util.Scanner;
public class T16{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    if(a%2==0){
      if(a>10){
        System.out.println("An even number greater than 10");
      }
      else{
        System.out.println("An even number not greater than 10");
      }
    }
    else{
      if(a>10){
        System.out.println("An odd number greater than 10");
      }
      else{
        System.out.println("An odd number not greater than 10");
      }
    }
  }
}