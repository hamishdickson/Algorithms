package JavaAlgorithms.Section1.Exercises;

import JavaAlgorithms.Section1.LinkedList.PushdownStack;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {
    private static final Map<String, String> pairsOfBrackets;

    static {
        pairsOfBrackets = new HashMap<>();
        pairsOfBrackets.put(")", "(");
        pairsOfBrackets.put("}", "{");
        pairsOfBrackets.put("]", "[");
    }

    public boolean isBalanced(String testString) {
        PushdownStack<String> pushdownStack = new PushdownStack<>();

        for (int i = 0; i < testString.length(); i++) {
            String s = testString.substring(i, i + 1);

            if (isOpeningBracket(s)) {
                pushdownStack.push(s);
            } else {
                if(isUnbalanced(pushdownStack, s)) return false;
            }
        }

        return pushdownStack.isEmpty();
    }

    private boolean isUnbalanced(PushdownStack<String> pushdownStack, String s) {
        String lastOpening = pushdownStack.pop();
        String newClosing = pairsOfBrackets.get(s);
        return !newClosing.equals(lastOpening);
    }

    private boolean isOpeningBracket(String bracket) {
        return bracket.equals("(") || bracket.equals("{") || bracket.equals("[");
    }
}