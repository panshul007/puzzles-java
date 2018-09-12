package trickers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BalancedBraces {

    private static final String sampleBalanced = "{[()()][]}";
    private static final String sampleBalancedImpure = "{[(3)(a+b)][]}";
    private static final String sampleUnbalanced = "{[()}";

    private static final List<Character> openings = new ArrayList<Character>() {{
        add('{'); add('['); add('(');
    }};

    private static final List<Character> closings = new ArrayList<Character>() {{
        add('}'); add(']'); add(')');
    }};


    private static final Map<Character, Character> openingsMap = new HashMap<Character, Character>() {{
        put('}','{');
        put(']','[');
        put(')','(');
    }};

    public static void main(String[] args) {
        System.out.println(isBalanced(sampleBalanced));
        System.out.println(isBalanced(sampleBalancedImpure));
        System.out.println(isBalanced(sampleUnbalanced));

        System.out.println("refactored:");

        System.out.println(isBalanced2(sampleBalanced));
        System.out.println(isBalanced2(sampleBalancedImpure));
        System.out.println(isBalanced2(sampleUnbalanced));
    }

    private static boolean isBalanced(String sample) {
        Stack braceStack = new Stack();
        for (int i=0; i<sample.length();i++) {
            char brace = sample.charAt(i);
            if (brace == '{' || brace == '[' || brace == '(') {
                braceStack.push(brace);
            }
            if (brace == '}' || brace == ']' || brace == ')') {
                if (braceStack.empty()) {
                    return false;
                }
                char opening = (char)braceStack.pop();
                if ((opening == '{' && brace != '}') || (opening == '[' && brace != ']') || (opening == '(' && brace != ')')) {
                    return false;
                }
            }
        }
        return braceStack.empty();
    }

    private static boolean isBalanced2(String sample) {
        Stack braceStack = new Stack();
        for (int i=0; i<sample.length();i++) {
            char brace = sample.charAt(i);
            if (openings.contains(brace)) {
                braceStack.push(brace);
            }
            if (closings.contains(brace)) {
                if (braceStack.empty()) {
                    return false;
                }
                char opening = (char)braceStack.pop();
                if (openingsMap.get(brace) != opening ) {
                    return false;
                }
            }
        }
        return braceStack.empty();
    }
}

