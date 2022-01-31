public class User{
  public static void main(String [] args){
    Scope s1 = new Scope();
    s1.x = 4;
    s1.y = 1;
    s1.methodOne();
    s1.methodTwo();
    s1.x = s1.x - 2 ;
    s1.y = 3 + s1.x;
    s1.methodOne();
    s1.methodTwo();    
    s1.methodOne();
    s1.methodTwo();        
  }
}
