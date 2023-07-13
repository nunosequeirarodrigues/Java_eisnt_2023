package Aula05;
import java.io.*;
import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        System.out.println("Aula 02 >");

        Scanner scanner = new Scanner(System.in);

        String value = scanner.next();
        System.out.println("Valor inserido: " + value);

        /*
        Console cnsl = System.console();
        if (cnsl == null) {
            System.out.println(
                    "Não temos consolas disponíveis");
            return;
        }
        value = cnsl.readLine();
        System.out.println("Valor inserido: " + value);
         */
        System.out.println("Aula 02 <");

    }

}
