import java.util.Scanner;
public class as3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("Enter another number");
    int b = sc.nextInt();
    for(int c = 1; c<=a; c++){//number of rows
      for(int d = 1; d<=b; d++){//number of coloumns
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
    