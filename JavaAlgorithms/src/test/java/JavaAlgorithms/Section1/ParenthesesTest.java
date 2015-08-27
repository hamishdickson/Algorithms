package javaAlgorithms.section1;

import javaAlgorithms.section1.exercises.Parentheses;
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
    public void testThatBetterExampleWorks() {
        Parentheses parentheses = new Parentheses();
        String example = "({[()]})";

        assertEquals(true, parentheses.isBalanced(example));
    }

    @Test
    public void testThatHardExampleWorks() {
        Parentheses parentheses = new Parentheses();
        String example = "[()]{}{[()()]()}";

        assertEquals(true, parentheses.isBalanced(example));
    }

    @Test
    public void testThatDumbFailureExampleFails() {
        Parentheses parentheses = new Parentheses();
        String example = "((";

        assertEquals(false, parentheses.isBalanced(example));
    }

    @Test
    public void testThatBetterFailureExampleFails() {
        Parentheses parentheses = new Parentheses();
        String example = "[(])";

        assertEquals(false, parentheses.isBalanced(example));
    }
}