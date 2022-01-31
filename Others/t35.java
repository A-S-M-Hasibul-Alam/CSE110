import java.util.Scanner;
public class t35{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = 1;
    int b = 2;
    System.out.println(a);  
    System.out.println(b);
    int c = a*b;
    int count = 1;
    while(count<=1000){
      System.out.println(c);
      a = b;
      b = c;
      c = a*b;
      count++;
    }
  }
}
      