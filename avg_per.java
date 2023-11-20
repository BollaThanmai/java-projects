public class avg_per {
  public static void main(String args[]){
    float dbms=98;
    float csa=97;
    float ms=95;
    float ls=92;
    float java=89;
    float total;
    float avg;
    float per;
    total=dbms+csa+ms+ls+java;
    avg=(float)(total/5);
    per=(float)((total/500)*100);
     System.out.println("total marks"+total+"/500");
     System.out.println("average marks"+avg+"marks" );
     System.out.println("percentage"+per+"%");

  }

  
}
