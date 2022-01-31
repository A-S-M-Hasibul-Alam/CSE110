import java.util.Scanner;
public class a28{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int sum=0;
    for(int count=1; count<=n; count++){
      if(n%count==0){
        sum=sum+count;
      }
    }
    System.out.println(sum);
  }
}