//import java.util.Scanner;
public class A5T3{
  public static void main (String[] args){
    //Scanner sc=new Scanner(System.in);
    int [] marks = new int[]{10,30,20,50,40};
    int max=marks[0];
    int LargestLocation=0;
    for(int i=1;i<=4;i++){
      if(marks[i]>max){
        max=marks[i];
        LargestLocation=i;
      }
    }
    System.out.println("Largest number is " + max);
    System.out.println("Largest number is found at location  " + LargestLocation);
  }
}
