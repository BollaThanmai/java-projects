class project{
  public static void main(String args[]){
    int a=5;
    int count=0;
    if(a>1){
   for(int i=1;i<=a;i++){
    if(a%i==0){
      count++;
    }
   }
   if(count==2){
    System.out.println("its a prime number");
   }
   else{
    System.out.println("its not prime number");
   }
    }
    else{
    System.out.println("its not prime number");
    }
    
    }
}
