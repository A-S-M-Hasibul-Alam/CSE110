import java.util.Scanner;
public class tube11{
  public static void main (String args []){
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter the number of line");
    int line = sc.nextInt();
    for (int lineCount = 4; lineCount > 0; lineCount--){
      for (int space =1; space
             < lineCount; space++){
        System.out.print(" ");
      }
      for (int numCnt=4; numCnt <= lineCount; numCnt--){
        System.out.print(numCnt);
      }
      System.out.println();
    }
  }
}