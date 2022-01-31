import java.util.Scanner;
public class a18{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    if(a==0){
      System.out.println("1");
    }
    else{
      int digit=0;
      while(a>0){
        a=a/10;
        digit++;
      }
      System.out.println(digit);
    }
  }
}