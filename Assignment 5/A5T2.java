//import java.util.Scanner;
public class A5T2{
  public static void main(String[]args){
    //Scanner sc =new Scanner(System.in);
    int [] mark=new int[]{10,30,20,50,40};
    int sum=0;
    for(int i=0;i<=4;i++){
      sum=sum+mark[1];
    }
    double avg=sum/5.0;
    int BetterCount=0;
    for(int i=0;i<=4;i++){
      if (mark[i]>avg){
        BetterCount++;
      }
    }
    System.out.println(BetterCount+"Students are  better than average");
    System.out.println("They reciveed following marks");
    for(int i=0;i<=4;i++){
      if (mark[i]>avg){
        System.out.println(mark[i]);
      }
    }
  }
}
    