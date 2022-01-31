import java.util.Scanner;
public class lab9b{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    System.out.println("Enter numbers");
    int zercount=0;
    int onecount=0;
    int twocount=0;
    int threecount=0;
    int fourcount=0;
    int fivecount=0;
    int sixcount=0;
    int sevencount=0;
    int eightcount=0;
    int ninecount=0;
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
      if(a[i]==0){
        zercount++;
      }
      else if(a[i]==1){
        onecount++;
      }
      else if(a[i]==2){
        twocount++;
      }
      else if(a[i]==3){
        threecount++;
      }
      else if(a[i]==4){
        fourcount++;
      }
      else if(a[i]==5){
        fivecount++;
      }
      else if(a[i]==6){
        sixcount++;
      }
      else if(a[i]==7){
        sevencount++;
      }
      else if(a[i]==8){
        eightcount++;
      }
      else if(a[i]==9){
        ninecount++;
      }
    }
    System.out.println("0 has been enterd by user "+zercount+" times");
    System.out.println("1 has been enterd by user "+onecount+" times");
    System.out.println("2 has been enterd by user "+twocount+" times");
    System.out.println("3 has been enterd by user "+threecount+" times");
    System.out.println("4 has been enterd by user "+fourcount+" times");
    System.out.println("5 has been enterd by user "+fivecount+" times");
    System.out.println("6 has been enterd by user "+sixcount+" times");
    System.out.println("7 has been enterd by user "+sevencount+" times");
    System.out.println("8 has been enterd by user "+eightcount+" times");
    System.out.println("9 has been enterd by user "+ninecount+" times");
  }
}
