package omega.githubactions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testAddTwoNumbers(){
        int sum = Main.addTwoNumbers(2, 4);
        Assertions.assertEquals(6,sum);
    }
}
