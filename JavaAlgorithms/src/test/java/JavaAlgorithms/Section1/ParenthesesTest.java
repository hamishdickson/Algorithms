package JavaAlgorithms.Section1;

import junit.framework.TestCase;
import org.junit.Test;

public class ParenthesesTest extends TestCase {

    @Test
    public void testThatSimpleExampleWorks() {
        Parentheses parentheses = new Parentheses();
        String example = "()";

        assertEquals(true, parentheses.isBalanced(example));
    }

    @Test
    public void testThatDumbFailureExampleFails() {
        Parentheses parentheses = new Parentheses();
        String example = "((";

        assertEquals(false, parentheses.isBalanced(example));
    }
}