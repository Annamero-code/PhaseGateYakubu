public class NumbersOneToHundred {
    public static void main(String [] args){
    
    int divisibility = 0;
    int total = 0;
    
    for(int counter = 1; counter <= 100; counter ++){
        if(counter % 3 == 0){
         divisibility += counter;  
         total += 1;
         
//      System.out.print(total);
      
      }
      System.out.println(total);
   }
   
   
 }
 
}
