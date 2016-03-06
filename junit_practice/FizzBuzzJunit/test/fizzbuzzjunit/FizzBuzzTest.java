package fizzbuzzjunit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

    @Test
    public void 入力が３で割り切れる時() {
        int input = 6;
        
        String actualResult = FizzBuzz.fizzBuzz(input);
        
        assertThat(actualResult, equalTo("Fizz"));
    }
    
    @Test
    public void 入力が５で割り切れる時() {
        int input = 10;
        
        String actualResult = FizzBuzz.fizzBuzz(input);
        
        assertThat(actualResult, equalTo("Buzz"));
    }
    
    @Test
    public void 入力が３でも５でも割り切れる時() {
        int input = 30;
        
        String actualResult = FizzBuzz.fizzBuzz(input);
        
        assertThat(actualResult, equalTo("FizzBuzz"));
    }
    
    @Test
    public void 入力が３でも５でも割り切れない時() {
        int input = 4;
        
        String actualResult = FizzBuzz.fizzBuzz(input);
        
        assertThat(actualResult, equalTo("4"));
    }
}
