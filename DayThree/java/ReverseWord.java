public class ReverseWord {
    public static void main(String [] args){
    
    String word = "Yakubu";
    String reverse = "";
    
        for(int counter = word.length() - 1; counter >= 0; counter --){
        reverse += word.charAt(counter);
//        System.out.println(reverse);
        }
        System.out.println(reverse);
    }
}
