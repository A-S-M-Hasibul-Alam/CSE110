import java.util.Scanner;
public class lab9a{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    System.out.println("Enter numbers");
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int c=0; c<=9; c++){
      int count=0;
      for(int d=0; d<a.length; d++){
        if(a[d]==c){
          count++;
        }
      }
      System.out.println(c+" has been enterd by user "+count+" times");
    }
  }
}
