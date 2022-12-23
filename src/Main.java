import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input");
            String input = scanner.nextLine();
            String[] array = input.split(" ");
            if(array.length ==3) {

                int num1 = Integer.parseInt(array[0]);
                int num2 = Integer.parseInt(array[2]);
                String op = array[1];
                Operation operate1 = new Operation();
                int output3 = operate1.operate(num1, num2, op);
                System.out.println("Output");
                System.out.println(output3);

            }else{

            int num1 = Integer.parseInt(array[0]);
            int num2 = Integer.parseInt(array[2]);
            int num3 = Integer.parseInt(array[4]);

            if((num1 < -10 || num1 > 10) || (num2 < -10 ||num2 >10) || (num3 < -10 ||num3 > 10)){
                throw new RuntimeException("Недопустимое значение переменной");
            }


            String operate1 = array[1];
            String operate2 = array[3];

            Operation result1 = new Operation();
            Operation result2 = new Operation();
            int output2 = 0, output1 = 0;


            try {

                if (result1.getPriority(operate1) >= result2.getPriority(operate2)) {
                    output1 = result1.operate(num1, num2, operate1);
                    output2 = result2.operate(output1, num3, operate2);
                } else {
                    output1 = result1.operate(num2, num3, operate2);
                    output2 = result2.operate(num1, output1, operate1);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }


            System.out.println("Output");
            System.out.println(output2);
        }
    }
}}

