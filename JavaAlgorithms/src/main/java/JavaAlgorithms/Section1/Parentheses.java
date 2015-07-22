package JavaAlgorithms.Section1;

import JavaAlgorithms.Section1.LinkedList.PushdownStack;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {
    Map<String, String> pairs = new HashMap<>();

    public boolean isBalanced(String testString) {
        pairs.put(")", "(");
        pairs.put("}", "{");
        pairs.put("]", "[");

        PushdownStack<String> pushdownStack = new PushdownStack<>();

        for (int i = 0; i < testString.length(); i++) {
            String s = testString.substring(i, i + 1);

            if (s.equals("(") || s.equals("{") || s.equals("[")) {
                pushdownStack.push(s);
            } else {
                String last = pushdownStack.pop();
                String lastPair = pairs.get(s);
                if (!lastPair.equals(last)) return false;
            }
        }

        if (!pushdownStack.isEmpty()) return false;

        return true;
    }
}