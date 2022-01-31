import java.util.Scanner;
public class a6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum =0;
    for(int c=1; c<=n; c++){
      if(c%2==0){
        sum = sum+c*c*(-1);
      }
      else{
        sum = sum+c*c;
      }
    }
    System.out.println(sum);
  }
}