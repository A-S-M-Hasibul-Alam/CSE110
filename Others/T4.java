import java.util.Scanner;
public class T4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age");
    int age = sc.nextInt();
    if(age>18){
      System.out.println("Enter the payment");
      double in = sc.nextDouble();
      if(in>10000){
        if(in>20000){
          double t  = (in*(.1));
          System.out.println(t); 
        }
        else{
          double tax = (in*(.05));
          System.out.println(tax);
        }
      }
      else{
        System.out.println("No Tax");
      }
    }
    else{
      System.out.println("No Tax");
    }
  }
}
'
  