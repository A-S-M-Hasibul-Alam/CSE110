import java.util.Scanner;
public class T6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of S");
    double S = sc.nextDouble();
    if(S<100){
      double L = 3000-125*S*S;
      System.out.println(L);
    }
    else{
      double L = 12000/(4+(S*S/14900));
      System.out.println(L);
    }
  }
}