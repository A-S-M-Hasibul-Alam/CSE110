//import java.util.Scanner;
public class A5T7{
  public static void main (String[] args){
    //Scanner sc=new Scanner(System.in);
    int [] marks = new int[]{50,30,20,10,40};
    for(int j=0;j<marks.length-1;j++){
      int max=marks[j];
      int LargestLocation=j;
      for(int i=j+1;i<marks.length;i++){
        if(marks[i]>max){
          max=marks[i];
          LargestLocation=i;
        }
      }
      int backup=marks[j];
      marks[j]=max;
      marks[LargestLocation]=backup;
    }
    for(int i =0;i<marks.length;i++){
      System.out.print(marks[i]+", ");
    }
  }
}
