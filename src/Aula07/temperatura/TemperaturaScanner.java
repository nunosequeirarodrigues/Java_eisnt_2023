package Aula07.temperatura;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperaturaScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza a idade");

        double temp_celsius;
        double temp_fahrenheit;
        boolean error;

        do {
            error = false;

            System.out.println("Indique a temperatura em ºCelsius.");
            try {
                temp_celsius = sc.nextDouble();
                temp_fahrenheit = to_fahrenheit(temp_celsius);

                System.out.println("A temperatura em ºFahrenheit é " + temp_fahrenheit);
            }catch ( InputMismatchException ex){
                error = true;
            }

        } while (!error);


    }

    private static double to_fahrenheit( double from_celsius ){
        BigDecimal bd;
        bd = new BigDecimal(from_celsius * ( 9.0 / 5.0 ) + 32.0).setScale(2, RoundingMode.HALF_UP);
        return   bd.doubleValue();
    }

}
