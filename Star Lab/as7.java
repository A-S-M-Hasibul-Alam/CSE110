import java.util.Scanner;
public class as7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int c = 1; c<=a; c++){// number of lines
      for(int d =a-c; d>=1; d--){// number of spaces
        System.out.print(" ");
      }
      for(int e =1; e<=c; e++){// number of stars
        System.out.print("*");
      }
      System.out.println();
    }
  }
}