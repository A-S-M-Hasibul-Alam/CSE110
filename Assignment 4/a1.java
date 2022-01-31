import java.util.Scanner;
public class a1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("The name of your favorite car");
    String car = sc.nextLine();
    System.out.println("Enter a number");
    int a = sc.nextInt();
    
    for(int d=1; d<=a; d++){
      System.out.println(car);
    }
  }
}