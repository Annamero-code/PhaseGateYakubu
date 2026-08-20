import java.util.Scanner;

public class TaskTwo {


    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    System.out.println("enter score: ");
    int score = input.nextInt();
    
    double average = 0;
    double sum = 0;
    for (int counter = 0; counter < 10; counter ++){
    sum += score;
    average = sum / 10;
    
    System.out.println("enter score");
    score = input.nextInt();
    
    
    }
    System.out.println("the average is "+ average);
    }
}
