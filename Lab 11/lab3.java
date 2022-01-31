import java.util.Scanner;
public class lab3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    int max = a[0], min = a[0];
    int maxl = 0, minl = 0;
    for(int j=1; j<a.length; j++){
      if(a[j]>max){
        max = a[j];
        maxl = j;
      }
      if(a[j]<min){
        min = a[j];
        minl = j;
      }
    }
    System.out.println("Smallest number "+ min+" was found at location "+minl);
    System.out.println("largest number "+ max+" was found at location "+maxl);
  }
}
