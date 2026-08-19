public class AverageOfNumber {
    public static void main (String [] args){
    
    int sum = 0;
    int average = 0;
    
        for ( int counter = 1; counter <= 100; counter ++){
        sum = sum + counter;
        average = sum / 100;
//        System.out.print(average);
    
        }
        
        System.out.println(average);
    }
}
