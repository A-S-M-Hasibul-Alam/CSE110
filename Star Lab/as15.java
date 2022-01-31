import java.util.Scanner;
public class as15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int row= sc.nextInt();
    System.out.println("Enter coloumn number");
    int coloumn= sc.nextInt();
    for(int a=1; a<=row; a++){
      for(int b=1; b<=coloumn; b++){
        if(a==1 || a==row || b==1 || b==coloumn){
          System.out.print(b);
        }
        else{
          System.out.print(" ");
        }
      }
        System.out.println();
    }
    
  }
}  