import java.util.Scanner;
public class t7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int index=0; index<a.length; index++){
      a[index] = sc.nextInt();
    }
    for(int i=a.length-1; i>=0; i--){
      if(a[i]%2==0){
        System.out.println(a[i]);
        break;
      }
    }
  }
}