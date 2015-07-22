package JavaAlgorithms.Section1;

import JavaAlgorithms.Section1.LinkedList.PushdownStack;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {
    private Map<String, String> pairs = new HashMap<>();

    public boolean isBalanced(String testString) {
        buildPairsMap();
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
        String newClosing = pairs.get(s);
        return doesTheClosingBracketMatchAnOpeningBracket(lastOpening, newClosing);
    }

    private boolean doesTheClosingBracketMatchAnOpeningBracket(String last, String lastPair) {
        return !lastPair.equals(last);
    }

    private void buildPairsMap() {
        pairs.put(")", "(");
        pairs.put("}", "{");
        pairs.put("]", "[");
    }

    private boolean isOpeningBracket(String bracket) {
        return bracket.equals("(") || bracket.equals("{") || bracket.equals("[");
    }
}