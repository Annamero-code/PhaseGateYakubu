import java.util.Scanner;

public class TaskSeven {
    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    
    int average = 0;
    int evenNumbers = 0;
    int sum = 0;
    for (int counter = 0; counter < 10; counter ++){
   
    System.out.println("enter score");
    int score = input.nextInt();
    if(counter % 2 == 0);
    sum += score;
    evenNumbers += score;
    average = evenNumbers / counter;
    
    
    }
    
    System.out.printf("the sum is %d average is  %d ", sum, average);
    
    }
    
}
