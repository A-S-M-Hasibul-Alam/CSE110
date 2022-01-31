import java.util.Scanner;
public class A5T8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Input the array length");
    int al=sc.nextInt();
    int a[]=new int[al];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    int backup=a[0];
    for(int j=0;j<a.length-1;j++)
    {
      backup=a[j];
      for(int i=j+1;i<a.length;i++)
      {
        if(a[i]<a[j])
        {
          a[j]=a[i];
          a[i]=backup;
          backup=a[j];
        }
      }
    }
    int median;
    if(al%2==1)
    {
      median=al/2;
    }
    else{
      int middlenumber=al/2;
      median=(a[middlenumber]+a[middlenumber-1])/2;
    }
    System.out.println("median is :"+median);
  }
}
