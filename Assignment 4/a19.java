import java.util.Scanner;
public class a19{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int prod=1;
    for(int c=1; c<=a; c++){
      prod=prod*10;
    }
    System.out.println(prod);
  }
}