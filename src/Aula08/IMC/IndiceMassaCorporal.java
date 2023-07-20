package Aula08.IMC;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IndiceMassaCorporal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza a idade");

        double peso;
        double altura;
        double imc;
        boolean error;

        do {
            error = false;


            try {
                System.out.println("Indique o seu peso [Kg].");
                peso = sc.nextDouble();
                System.out.println("Indique a sua altura [m].");
                altura = sc.nextDouble();
                imc = do_imc(peso, altura);

                System.out.println("O seu Índice de Massa Corporal é " + imc);

                do_imc_message(imc);

            }catch ( InputMismatchException ex){
                error = true;
            }

        } while (!error);


    }

    private static double do_imc( double peso, double altura ){
        BigDecimal bd;
        bd = new BigDecimal(peso /( altura * altura ) ).setScale(2, RoundingMode.HALF_UP);
        return   bd.doubleValue();
    }
    private static void do_imc_message( double imc ){
        if (imc < 18.6 ){
            System.out.println("Abaixo do peso.\tGanhar peso.");
        } else if (imc >= 18.6 && imc < 25 ) {
            System.out.println("Peso Normal.\tSuplementos.");
        } else if (imc >= 25 && imc < 40 ) {
            System.out.println("Obesidade I.\tPrograma Plus.");
        } else if ( imc >= 40 ) {
            System.out.println("Obesidade II.\tPrograma Ultra plus.");
        }
    }

}
