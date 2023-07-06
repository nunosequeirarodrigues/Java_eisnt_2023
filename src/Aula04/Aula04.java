package Aula04;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Aula04 {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String name = null;
        Integer idade = 0;
        Boolean error = false;
        Empregado emp = null;
        Integer numeroEntradas = 0;


        try {

            System.out.println("Quantos Empregados quer introduzir:?");
            numeroEntradas = Integer.parseInt( reader.readLine() );

        } catch (IOException | NumberFormatException e) {
            numeroEntradas = 0;
        }

        if ( numeroEntradas < 1 || numeroEntradas > 10 ) {
            System.out.println("Só pode introduzir entre 1 e 10 Empregados.");
            error = true;
        }

        if (false == error) {
            for (int i = 1; i <= numeroEntradas; i++) {

                error = false;
                name = null;
                idade = 0;
                error = false;
                emp = null;

                try {

                    System.out.println("Introduza o nome do Empregado:");
                    name = reader.readLine();

                } catch (IOException e) {
                    //           throw new RuntimeException(e);
                    System.err.println("Erro a obter o nome do Empregado");
                    error = true;
                }

                if (false == error) {
                    try {

                        System.out.println("Introduza a idade do Empregado:");
                        idade = Integer.parseInt(reader.readLine());

                    } catch (NumberFormatException e) {
                        idade = 0;
                    } catch (IOException e) {
                        System.err.println("Erro a obter a idade do Empregado");
                        error = true;
                    }
                }

                if (false == error) {
                    if (name.isEmpty() && idade == 0) {
                        emp = new Empregado();
                    } else {
                        emp = new Empregado(name, idade);
                    }

                    System.out.println( emp.toString() );
                }
            }
        }


    }
}
