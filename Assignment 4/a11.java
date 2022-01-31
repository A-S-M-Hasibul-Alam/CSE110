import java.util.Scanner;
public class a11{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int n=0;
    for(int b=1; b<=10; b++){
      System.out.println("Enter a number");
      int a=sc.nextInt();
      if(a%2==1){
        sum=sum+a;
        n++;
      }
      
      
    }
    System.out.println(sum);
    int avg = sum/n;
    System.out.println(avg);
  }
}
