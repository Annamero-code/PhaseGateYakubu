public class FunctionTasks{

    public static int add(int number1, int number2){
    int addition = number1 + number2;
    return addition;
    }


    public static boolean evenNumber(int number){
    if(number % 2 == 0){
    return true;
    }
    else{
    return false;
    }
    }


    public static int square(int number){
    int multilication = number * number;
    return multilication;
    }


    public static int largest(int number1, int number2, int number3){
    int largest = number1;
    if(number2 > largest){
    largest = number2;
    if(number3 > largest){
    largest = number3;
    }
    }
    return largest;
    }
    
    public static int areaOfRectangle(int length, int width){
    int area = length * width;
    return area;
    }


    public static int reverse(String numbers ){
    String reverse = "";
    for(int counter = numbers.length() -1; counter >= 0; counter --){
    reverse += counter.charAtnumbers;
    return reverse;
    }

    public static void main(String [] args){
    int addition = add(7,2);
    System.out.println(addition);

    boolean number = evenNumber(1);
    System.out.println(number);

      int multilication = square(4);
      System.out.println(multilication);
    
        int number = largest(6,8,3);
        System.out.println(number);
        
        int area = areaOfRectangle(14,2);
        System.out.println(area);
        
        String reverse = reverse("4575367");
        System.out.println(reverse);
        
        













    }
}
