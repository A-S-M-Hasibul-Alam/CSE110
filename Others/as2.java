public class as2{
  public static void main(String args[]){
    int marks[] = new int[]{10, 30, 20, 50, 40};
    int sum=0;
    for(int i=0; i<marks.length; i++){
      sum = sum+marks[i];
    }
    int avg = sum/marks.length;
    int d=0;
    for(int j=0; j<marks.length; j++){
      if(marks[j]>avg){
        d++;
      }
    }
    System.out.println(d+" students are better than average.");
    System.out.println("They received following marks.");
    for(int k=0; k<marks.length; k++){
      if(marks[k]>avg){
        System.out.println(marks[k]);
      }
    }
  }
}
      
    