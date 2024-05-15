package com.justin.interpreter.math;

import java.util.Stack;
//解释器模式
interface Expression {
    int interpret();
}
//终结表达式
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}


// 非终结符表达式（Nonterminal Expression）
class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
// 非终结符表达式（Nonterminal Expression）
class SubtractExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public SubtractExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
public class SimpleMathExpress {
    public static void main(String[] args) {
        String expression = "3 5 + 2 -"; // 后缀表达式（逆波兰表达式）
        Expression result = parse(expression);
        System.out.println("Result: " + result.interpret()); // 输出: 6
    }

    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperatorInstance(token, leftExpression, rightExpression);
                stack.push(operator);
            } else {
                Expression number = new NumberExpression(Integer.parseInt(token));
                stack.push(number);
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }

    public static Expression getOperatorInstance(String operator, Expression left, Expression right) {
        switch (operator) {
            case "+":
                return new AddExpression(left, right);
            case "-":
                return new SubtractExpression(left, right);
        }
        return null;
    }
}
