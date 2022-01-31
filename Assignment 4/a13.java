import java.util.Scanner;
public class a13{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    System.out.println("Enter a number");
    int n= sc.nextInt();
    for(int c=1; c<=n; c++){
      if(c%2==1){
        sum=sum+c;
      }
    }
    System.out.println(sum);
  }
}