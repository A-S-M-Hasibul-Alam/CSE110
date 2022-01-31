public class Scope{
  public int x;
  public int y;
  public void methodOne(){
    x = x + 2;
    y = y + 1;
    System.out.println( x + " " + y );
  }
  public void methodTwo(){
    x = x + y;
    y = x - 1;
    System.out.println( x + " " + y );
  }
}
