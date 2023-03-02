import java.util.Stack;

public class main {

    public static void main(String[] args) {
        String parentheses = "[]{}(<>)";
        boolean isValid = isCorrectParentheses(parentheses);
        System.out.println(isValid);
    }

    private static boolean isCorrectParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}' || ch == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{') || (ch == '>' && top != '<')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}