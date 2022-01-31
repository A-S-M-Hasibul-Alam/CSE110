import java.util.Scanner;
public class a23{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int num=n;
    int rem=0;
    while(num>0){
      num=num/10;
      rem++;
    }
    int prod=1;
    int count=1;
    while(count<=rem-1){
      prod=prod*10;
      count++;
    }
    while(n>0){
      int a= n/prod;
      if(a>=0){
      if(a==0){
        System.out.println("Zero");
      }
      else{
        if(a==1){
          System.out.println("One");
        }
        else{
          if(a==2){
            System.out.println("Two");
          }
          else{
            if(a==3){
              System.out.println("Three");
            }
            else{
              if(a==4){
                System.out.println("Four");
              }
              else{
                if(a==5){
                  System.out.println("Five");
                }
                else{
                  if(a==6){
                    System.out.println("Six");
                  }
                  else{
                    if(a==7){
                      System.out.println("Seven");
                    }
                    else{
                      if(a==8){
                        System.out.println("Eight");
                      }
                      else{
                        if(a==9){
                          System.out.println("Nine");
                        }
                        else{
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
      n=n%prod;
      prod=prod/10;
    }
  }
}