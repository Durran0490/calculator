package calculator;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {

        String a = expression[0];
        String op1 = expression[1];
        String b = expression[2];
        String op2 = expression[3];
        String c = expression[4];

        var result = calc(a, op1, b);

        if(expression.length ==5) {

            if (op2 == "/" ){
                result = calc(b, op2, c);
                result = calc(a, op1, Double.toString(result));
            }else if (op2 == "*" ) {
                result = calc(b, op2, c);
                result = calc(a, op1, Double.toString(result));
            }else{
                result = calc(Double.toString(result), op2, c);
            }
        }

        return Double.toString(result);

    }
    double calc(String stra, String op, String strb) {
        double a = Double.parseDouble(stra);
        double b = Double.parseDouble(strb);
        double result;
        switch (op){
            case "+": result = a+b;
                break;
            case "-": result = a-b;
                break;
            case "*": result = a*b;
                break;
            case "/": result = a/b;
                break;
            default: result = 0;

        }
        return result;
    }

}
