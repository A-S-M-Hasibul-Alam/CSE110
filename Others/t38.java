import java.util.Scanner;
public class t38{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int count = 1;
    int div = 0;
    while(count<=a){
      if(a%count == 0){
        div++;
        }
        count++;
      }
      if(div == 2){
        System.out.println("Prime");
      }
      else{
      System.out.println("Not Prime");
    }
  }
}