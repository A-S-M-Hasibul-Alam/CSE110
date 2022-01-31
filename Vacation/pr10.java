import java.util.Scanner;
public class pr10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    for(int n=1; n<=a-1; n++){
      for(int g=1; g<=a-n; g++){
        System.out.print(" ");
      }
      for(int s=1; s<=2*n-1; s++){
        System.out.print("*");
      }
      System.out.println();
    }
    for(int m=a; m>=1; m--){
      for(int h=1; h<=a-m; h++){
        System.out.print(" ");
      }
      for(int t=1; t<=2*m-1; t++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
