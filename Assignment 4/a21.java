import java.util.Scanner;
public class a21{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int num=n;
    int rem=0;
    while(num>0){
      num=num/10;
      rem++;
    }
    int prod=1;
    int count=1;
    while(count<=rem-1){
      prod=prod*10;
      count++;
    }
    while(n>0){
      int a= n/prod;
      System.out.println(a);
      n=n%prod;
      prod=prod/10;
    }
  }
}