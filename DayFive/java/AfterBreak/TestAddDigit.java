
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAddDigit{
    @Test
    
    public void testThatIfIWillGetTheSumOfIntegerTillIHaveJustAGigitLeft(){
    //given
    int number = 11;
    
    //when
    
    int expectedResult = AddDigit.addInteger(number);
    
    int actualResult = 2;
    
    //check
    assertEquals(actualResult, expectedResult);
    
    }

}






