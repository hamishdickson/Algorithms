package JavaAlgorithms.Section1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by hamishdickson on 18/07/15.
 */
public class ParenthesesTest extends TestCase {

    @Test
    public void testThatSimpleExampleWorks() {
        Parentheses parentheses = new Parentheses();
        String example = "()";

        assertEquals(true, parentheses.isBalanced(example));
    }
}