import java.util.Scanner;
public class pr30{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int div = 0;
    for(int i=1; i<=a; i++){
      if(a%i==0){
        System.out.print(i+", ");
        div++;
      }
    }
    System.out.println("total divisors = "+div);
  }
}