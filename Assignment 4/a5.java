import java.util.Scanner;
public class a5{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int sum =0;
    for(int c=1; c<=n; c++){
      sum = sum+c*c*c;
    }
    System.out.println(sum);
  }
}
    