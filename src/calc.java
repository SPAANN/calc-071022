import java.util.Scanner;
import java.lang.Math;
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
 //       System.out.println();
 //       System.out.println(String.valueOf(num1) + " " + oper + " " + String.valueOf(num2));
 //       System.out.println();
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
        if (oper.equals("**")){
            System.out.println("Введите коэффицент C, число 1 и число 2 - a,b");
            double c = s.nextInt();
            double d = num2*num2-4*num1*c;
//            System.out.println(d);
//            System.out.println(c);
            double x1 = (-1*num2+Math.sqrt(d))/(2*num1);
            double x2 = (-1*num2-Math.sqrt(d))/(2*num1);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}