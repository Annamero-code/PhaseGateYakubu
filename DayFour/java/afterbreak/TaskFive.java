import java.util.Scanner;

public class TaskFive {
    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    
 
    int evenNumbers = 0;
    int sum = 0;
    for (int counter = 0; counter < 10; counter ++){
   
    System.out.println("enter score");
    int score = input.nextInt();
    if(counter % 2 == 0){
    
//    evenNumbers += score;
    }
    
    evenNumbers += score;
    }
    
    
    System.out.println("the even numbers are "+ evenNumbers);
    
    }
    
}

