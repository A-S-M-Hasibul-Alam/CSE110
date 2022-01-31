import java.util.Scanner;
public class lab9c{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    int b[] = new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int k=0;k<a.length;k++){
      for(int j=0;j<b.length;j++){
        if(a[k]==j){
          b[j]=b[j]+1;
        }
      }
    }
    for(int c=0;c<b.length;c++){
      System.out.println(c+" has been enterd by user "+b[c]+" times");
    }
  }
}
