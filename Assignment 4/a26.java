import java.util.Scanner;
public class a26{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int div=0;
    for(int a=1; a<=n; a++){
      if(n%a==0){
        div++;
      }
    }
    if(div==2){
      System.out.println("Prime");
    }
    else{
      System.out.println("Not Prime");
    }
  }
}