import java.util.Scanner;
public class t4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int index=0; index<a.length; index++){
      a[index] = sc.nextInt();
    }
    for(int i=0; i<=a.length-1; i++){
      if(a[i]%2==1){
        System.out.println(a[i]);
        break;
      }
    }
  }
}