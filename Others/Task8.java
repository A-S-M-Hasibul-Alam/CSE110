  import java.util.Scanner;
  public class Task8{
    public static void main(String args[]){
      Scanner ac = new Scanner(System.in);
      System.out.println("Enter a number");
      double num1 = ac.nextDouble();
      System.out.println("Enter another number");
      double num2 = ac.nextDouble();
      if(num1>num2){
        double sub = num1-num2;
        System.out.println(sub);
      }
    }
  }
        
        