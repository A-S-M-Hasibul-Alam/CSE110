import java.util.Scanner;
public class T14{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    if(a>0){
      System.out.println(a);
    }
    else{
      a = a*(-1);
      System.out.println(a);
    }
  }
}