import java.util.Scanner;
public class T15{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a time");
    int t = sc.nextInt();
    if(t>=0){
      if(t>=4){
        if(t>6){
          if(t>=12){
            if(t>=14){
              if(t>=16){
                if(t>=18){
                  if(t>=19){
                    if(t>=21){
                      if(t>24){
                      System.out.println("Wrong Time");
                      }
                      else{
                      System.out.println("Patience is a virtue");
                      }
                    }
                    else{
                    System.out.println("Dinner");
                    }
                  }
                  else{
                  System.out.println("Patience is a virtue");
                  }
                }
                else{
                System.out.println("Snacks");
                }
              }
              else{
              System.out.println("Patience is a virtue");
              }
            }
            else{
            System.out.println("Lunch");
            }
          }
          else{
          System.out.println("Patience is a virtue");
          }
        }
        else{
        System.out.println("Breakfast");
        }
      }
      else{
      System.out.println("Patience is a virtue");
      }
    }
    else{
    System.out.println("Wrong time");
    }
  }
}
    