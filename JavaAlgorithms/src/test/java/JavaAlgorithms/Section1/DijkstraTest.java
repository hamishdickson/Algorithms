package JavaAlgorithms.Section1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by hamishdickson on 17/06/15.
 */
public class DijkstraTest extends TestCase {
    @Test
    public void testEvaluateSimpleExpression() {
        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        Dijkstra dijkstra = new Dijkstra();

        assertEquals(101.0, dijkstra.dijkstra(expression));
    }
}