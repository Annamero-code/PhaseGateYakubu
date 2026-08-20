import java.util.Scanner;

public class TransactionLogApp {
    public static double depositAmount(double depositAmount, double currentAmount){
    double updatedAmount = depositAmount + currentAmount;

    if(depositAmount <= 0){
    return currentAmount;
    }
    else{
    } 
    return updatedAmount;
    
    }


    public static double amountWithdraw(double withdrawer, double currentBalance){
    double updatedBalance = currentBalance - withdrawer;
    if(withdrawer <= 0){
    return currentBalance;
    }
    else{
    }
    return updatedBalance;
    }




    public static void main(String [] args){
    Scanner input = new Scanner (System.in);
    
    
            int transactionMenuChoice;
                do {
                
                String transactionMenu = """
                Welcome To Transaction Log App
                1 Deposit
                2 withfraw
                3 show transaction
                4 exit
                """;
                System.out.println(transactionMenu);
                }
    
    
   
    
    
    }
}
