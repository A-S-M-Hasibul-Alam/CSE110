public class Quizb{
  public static void main(String args[]){
    int x = 0; int y = 0;
    int sum = 0;
    while(x<10){
      y = x-3;
      while(y<3){
        sum = sum%3+x-y*3;
        System.out.println(sum);
        y = y+1;
      }
      if(x>5){
        x++;
      }
      else{
      x+=2;
      }
    }
  }
}