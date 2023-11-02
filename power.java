public class power {
  public static void main(String args[]){
    double base=2;
    double power=4;
    int count=1;
    while (power !=0){
     count*=base;
     power--;
    }
    System.out.println("result"+count);
  }
  
}
