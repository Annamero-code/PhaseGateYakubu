import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTransactionLogApp {

    @Test
    
    public void testThatIfIDepositeMoneyIGetIncreamentInTheAccountBalance(){
    
    //Given
    double currentAmount = 10000;
    double depositAmount = 3000;
    
 
    
    //when
    double expectedAmount = TransactionLogApp.depositAmount(depositAmount, currentAmount);
    
    
    //expeted
    double actualAmount = 13000;
    
    
    
    //check
    assertEquals(actualAmount, expectedAmount);
    
    }
    
    @Test
    public void testThatIfIWithdrawMoneyIGetDecreamentInTheAccountBalance(){
    
    //given
    double currentBalance = 10000;
    double withdrawer = 3000;
    
    
    //when
    
    double expectedBalance = TransactionLogApp.amountWithdraw(withdrawer, currentBalance);
    
    
    //expected
     double actualBalance = 7000;
     
     //check
     assertEquals(actualBalance, expectedBalance);
     
    }
    
    @Test
    public void 
    
    
}

