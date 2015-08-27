package javaAlgorithms.section1;

import java.util.Stack;

/**
 * Created by hamishdickson on 16/06/15.
 *
 * Dijkstra's two stack algorithm for expression evaluation
 *
 * treats operands and operators differently
 *
 * push operands onto an operand stack
 * push operators onto an operator stack
 * ignore left parentheses
 * on right parentheses, pop an operator, pop the required number of operands and push onto the operand stack the result
 *
 */
public class Dijkstra {
    public double dijkstra(String string) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        String[] parts = string.split(" ");

        for (int i = 0; i < parts.length; i++) {
            String s = parts[i];

            // todo - yucky (java needs pattern matching)
            if (s.equals("(")); // ignore
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();

                // note - could use a switch
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }

        return vals.pop();
    }
}
