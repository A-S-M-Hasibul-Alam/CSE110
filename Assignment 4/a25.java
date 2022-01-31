import java.util.Scanner;
public class a25{
  public static void main(String ars[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int div=0;
    for(int a=1; a<=n; a++){
      if(n%a==0){
        div++;
      }
    }
    System.out.println(div);
  }
}