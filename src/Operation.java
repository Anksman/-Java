public class Operation {
    public static int operate(int a, int c, String str) {
        int result = 0;

        switch (str) {
            case "+":
                result = a + c;
                break;
            case "*":
                result = a * c;
                break;
            case "-":
                result = a - c;
                break;
            case "/":
                result = a / c;

                break;
            default:
                System.out.println("неправильно ввели знак операции");

        }
        return result;
    }
    public  int getPriority(String op) {

        if (op.equals("+") ) {
            return 1;
        } else if (op.equals("-")) {
            return 1;
        } else if (op.equals("*")) {
            return 2;
        } else if (op.equals("/")) {
            return 2;
        }

        return 0;

    }



}

