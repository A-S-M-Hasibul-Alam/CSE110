import java.util.Scanner;
public class a15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int row = sc.nextInt();
    System.out.println("Enter coloumn number");
    int coloumn = sc.nextInt();
    for(int c=1; c<=row; c++){
      for(int d=1; d<=coloumn; d++){
        if(c==1 || c==row || d==1 || d==coloumn){
          System.out.print(c);
          
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
        
    
    