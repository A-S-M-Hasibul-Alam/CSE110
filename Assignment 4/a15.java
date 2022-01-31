import java.util.Scanner;
public class a15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    System.out.println("Enter a number");
    int n= sc.nextInt();
    for(int c=1; c<=n; c++){
      System.out.println("Enter a number");
    int a= sc.nextInt();
      sum=sum+a;
      
      
      System.out.println(sum);
    }
  }
}