import java.util.Scanner;
public class hw1{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter user`s age");
    int age = sc.nextInt();
    if(age == 16){
      System.out.println("Better clear road");
    }
    else{
    if (age > 16)
    System.out.println("You are getting pretty old");
      else{
    System.out.println("Too young to drive");
    }
    }
  }
}
    