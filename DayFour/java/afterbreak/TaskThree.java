import java.util.Scanner;

public class TaskThree {
    public static void main (String [] args ){
    Scanner input = new Scanner (System.in);
    System.out.println("enter score: ");
    int score = input.nextInt();
    
    int average = 0;
    int sum = 0;
    for (int counter = 0; counter < 10; counter ++){
    sum += score;
    average = sum / 10;
    
    System.out.println("enter score");
    score = input.nextInt();
    
//    System.out.println("the sum is "+ sum);
    }
    System.out.printf("the sum is %d, the average is %d", sum , average);
    
    }
    
}

