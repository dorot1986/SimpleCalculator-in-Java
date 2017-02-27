package simpleCalculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Prosty kalkulator*/


public class Main {
    public static void main(String[] args) {
        System.out.println("----Witaj w SimpleCalculatorJava v1.0----");
        System.out.println();
        System.out.println("Kalkulator umożliwia wykonanie następujących działań:");
        System.out.println("+ [dodawanie]");
        System.out.println("- [odejmowanie]");
        System.out.println("* [mnożenie]");
        System.out.println("/ [dzielenie]");
        System.out.println();
        System.out.println("Aby przerwać obliczenia wpisz 'Exit' zamiast działania.");
        System.out.println("------------------------------------------");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double a, b;
        try{
            System.out.println("Podaj pierwszą liczbę: ");
            a = sc.nextDouble();
            String operation;
            do{
                System.out.println("Podaj działanie:");
                operation = sc.next();
            } while (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("Exit")));
            if (operation.equals("Exit")){
                System.out.println("Dziękujemy za korzystanie z SimpleCalculatorJava v1.0!");
            }
            else {
                System.out.println("Podaj drugą liczbę: ");
                b = sc.nextDouble();
                if (operation.equals("+")) {
                    System.out.println("Wynik: " + add(a, b));
                }
                else if (operation.equals("-")){
                    System.out.println("Wynik: " + substract(a, b));
                }
                else if (operation.equals("*")){
                    System.out.println("Wynik: " + multiply(a, b));
                }
                else {
                    System.out.println("Wynik: " + divide(a, b));
                }
            }
        }catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static double add(double a, double b){
        return a+b;
    }
    public static double substract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        if (b!=0){
            return (double) a/b;
        }
        else{
            System.out.println("Nie dziel przez 0!");
            return 0;
        }
    }
}
