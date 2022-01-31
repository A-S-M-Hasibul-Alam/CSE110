import java.util.Scanner;
public class pr8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a; n++){
      for(int g=1; g<=a-n; g++){
        System.out.print(" ");
      }
      for(int s=1; s<=2*n-1; s++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
