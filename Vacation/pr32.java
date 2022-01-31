import java.util.Scanner;
public class pr32{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int div = 0;
    for(int i=1; i<=a-1; i++){
      if(a%i==0){
        div++;
      }
    }
    if(div == 1){
      System.out.println("Prime");
    }
  }
}