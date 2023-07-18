package Aula07.temperatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperatura {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        float temp_celsius;
        float temp_fahrenheit;
        boolean error;

        do{
            error = false;
            try {

                System.out.println("Indique a temperatura em ºCelsius.");

                temp_celsius = Float.parseFloat( reader.readLine() );
                temp_fahrenheit = to_fahrenheit( temp_celsius );

                System.out.println("A temperatura em ºFahrenheit é " + temp_fahrenheit) ;

            } catch (IOException | NumberFormatException e) {
                error = true;
            }
        }while(!error);


    }

    private static float to_fahrenheit( float from_celsius){
     return (from_celsius * ( 9.0f / 5.0f ) + 32.0f );
    }
}
