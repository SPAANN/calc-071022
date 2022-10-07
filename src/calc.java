import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        ///////////////////////////////////////////
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = s.nextInt();
        ///////////////////////////////////////////
        System.out.println("Введите второе число:");
        double num2 = s.nextInt();
        ///////////////////////////////////////////
        System.out.println("Введите оператор:");
        String oper = s.next();
        System.out.println();
        System.out.println(String.valueOf(num1) + " " + oper + " " + String.valueOf(num2));
        System.out.println();
        ////////////////////////////////////////////
        if (oper.equals("*")) {

            System.out.println(num1*num2);

        }
        if (oper.equals("+")) {

            System.out.println(num1+num2);

        }
        if (oper.equals("/")) {

            System.out.println(num1/num2);

        }
        if (oper.equals("-")){

            System.out.println(num1-num2);

        }
    }
}