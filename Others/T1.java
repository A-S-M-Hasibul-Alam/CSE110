import java.util.Scanner;
public class T1{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mark");
    double mark = sc.nextDouble();
    if(mark>50){
    System.out.println("Pass");
    }
    else{
    System.out.println("You shall not pass");
    }
  }
}