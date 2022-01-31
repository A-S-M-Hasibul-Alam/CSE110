import java.util.Scanner;
public class as6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n =  sc.nextInt();
    int marks[] = new int[]{50, 30, 20, 10, 40};
    for(int i=n-1; i<marks.length; i++){
      int max = marks[i];
      int maxL = i;
      for(int j=i+1; j<marks.length; j++){
        if(marks[j]>max){
          max = marks[j];
          maxL = j;
        }
        int temp = marks[i];
        marks[i] = max;
        marks[maxL] = temp;
      }
    }
      for(int w=0; w<marks.length; w++){
        System.out.print(marks[w]+" ");
      }
  }
}
    
  