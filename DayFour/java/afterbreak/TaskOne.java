import java.util.Scanner;

public class TaskOne {


    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    System.out.println("enter score: ");
    int score = input.nextInt();
    
    
    int sum = 0;
    for (int counter = 0; counter < 10; counter ++){
    sum += score;
    
    System.out.println("enter score");
    score = input.nextInt();
    
//    System.out.println("the sum is "+ sum);
    
    }
    System.out.println("the sum is "+ sum);
    }
}
