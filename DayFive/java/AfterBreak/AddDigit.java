public class AddDigit {
    
    public static int addInteger(int number){
         
        int totalNumber = 0;
        int lastDigit = 0;
        
        while (number != 0){ 
             lastDigit =  number % 10;
             totalNumber += lastDigit;
             number /= 10; 
        }
        return totalNumber;
    }
    
 
    
    public static void main(String[] args){
        int totalNumber =  addInteger (11);
        System.out.println(totalNumber);
    


  }
  
  }
