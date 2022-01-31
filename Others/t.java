import java.util.Scanner;
public class t{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int count=1; count<=a; count++){
      
      for(int s=a-count; s>=1; s--){
        System.out.print(" ");
      }
      for(int num=a; num<=1; num--){
        System.out.print(num);
      }
      System.out.println();
    }
  }
}