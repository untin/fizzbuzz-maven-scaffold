import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


public class GameNumberTest {
    @Test
    public void shouldShowFizz(){
        GameNumber gameNumber=new GameNumber();
        assertThat(gameNumber.of(3),is("Fizz"));
    }
    @Test
    public void shouldShowBuzz(){
        GameNumber gameNumber=new GameNumber();
        assertThat(gameNumber.of(5),is("Buzz"));
    }
    @Test
    public void shouldShowFizzBuzz(){
        GameNumber gameNumber=new GameNumber();
        assertThat(gameNumber.of(15),is("FizzBuzz"));
    }
}
