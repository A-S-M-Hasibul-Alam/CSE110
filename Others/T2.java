 import java.util.Scanner;
public class T2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mark");
    double mark = sc.nextDouble();
    if(mark>0){
      if(mark>49){ 
        if(mark>59){
          if(mark>69){
            if(mark>79){
            if(mark>89){
              System.out.println("A");
              }
            else{
            System.out.println("B");
            }
          }
            else{
            System.out.println("C");
            }
              }
             else{
          System.out.println("D");
             }
        }
          else{
        System.out.println("E");
      }
      }
        else{
      System.out.println("F");
      }
    }
    else{
    System.out.println("Wrong Input");
    }
  }
}
