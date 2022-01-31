import java.util.Scanner;
public class a29{
  public static void main(String ars[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum=0;
    for(int a=1; a<n; a++){
      if(n%a==0){
        sum=sum+a;
      }
    }
    if(sum==n){
      System.out.println("Perfect");
    }
    else{
      System.out.println("Not perfect");
    }
  }
}