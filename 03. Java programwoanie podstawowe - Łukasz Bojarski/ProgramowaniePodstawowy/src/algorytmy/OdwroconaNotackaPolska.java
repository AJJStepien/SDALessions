package algorytmy;

import java.util.Stack;

public class OdwroconaNotackaPolska {

    private int sprawdzPriorytetOperatora(char x) {
        switch (x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }

    public String przeksztalcNaONP(String operation) {
        operation = operation.trim();
        operation = operation.replace(" ", "");
        StringBuilder result = new StringBuilder();
        Stack stack = new Stack<Character>();
        stack.push(' ');

        for (int i = 0; i < operation.length(); i++) {
            if (operation.charAt(i) == '=') {
                while (!(stack.peek() == (Character) ' ')) {
                    result.append(stack.pop() + " ");
                }
            }
            switch (operation.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    while (stack.peek() != (Character) '(') {
                        result.append(stack.pop() + " ");
                    }
                    stack.pop();
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    while (!(stack.peek() == (Character) ' ')) {
                        if (sprawdzPriorytetOperatora(operation.charAt(i))<sprawdzPriorytetOperatora((char) stack.peek())){
                            result.append((char)stack.pop() + " ");
                        }
                        break;
                    }
                    stack.push(operation.charAt(i));
                    break;
                default:
                    result.append(operation.charAt(i) + " ");
                    break;
            }
        }

        return result.toString();
    }
}
