package by.it.ali.jd01_13;


import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class TaskA {
    static void SolveTaskA() //throws NumberFormatException, ArithmeticException//
    {
        try{
        String a="10";
        String b="14";
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println("Числа:"+a+" "+b+" "+c);
        double d = (Math.sqrt(parseDouble(a)) + Math.sqrt(parseDouble(b))+Math.sqrt(parseDouble(c)));
        System.out.println("Сумма корней всех чисел: "+d);}
        catch (NumberFormatException e){
            System.out.println("Неверно введено число! "+e);
        }
        catch (ArithmeticException e){
            System.out.println("Введено отрицательное число! "+e);
        }
    }
}
