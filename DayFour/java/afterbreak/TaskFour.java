import java.util.Scanner;

public class TaskFour {
    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    
 
     int even = 0;
    int sum = 0;
    for (int counter = 0; counter < 10; counter ++){
   
    System.out.println("enter score");
    int score = input.nextInt();
    if(counter % 2 ==0){
    
    even += score;
    }
    
    
    }
    
    
    System.out.print("the even is"+ even);
    
    }
    
}

