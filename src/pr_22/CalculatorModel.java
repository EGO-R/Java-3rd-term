package pr_22;


import java.util.Stack;


public class CalculatorModel {
    public double getResult(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();

        for (String token : expression.split("\\s+")) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    try {
                        stack.push(Double.parseDouble(token));
                    } catch (Exception e) {
                        throw new Exception("Error in expression");
                    }
                    break;
            }
        }


        if(stack.size()==1) return stack.pop();
        else throw new Exception("Error in expression");
    }

}
