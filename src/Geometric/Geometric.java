package Geometric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Geometric {
    public static void main(String[] args) {
        ArrayList<Shape2D> figuras = new ArrayList<>();

// Ler do ecrã
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String Valor;
        float xx;
        float yy;
        boolean error;
        Shape2D Figura;
        int numeroEntradas;

        error = false;


        try {

            System.out.println("Quantas figuras Pretende adicionar:?");
            numeroEntradas = Integer.parseInt( reader.readLine() );

        } catch (IOException | NumberFormatException e) {
            numeroEntradas = 0;
        }

        if ( numeroEntradas < 1 || numeroEntradas > 10 ) {
            System.out.println("Só pode introduzir entre 1 e 10 figuras.");
            error = true;
        }

        if (!error) {
            for (int i = 1; i <= numeroEntradas; i++) {

                xx = (float) 0;
                yy = (float) 0;
                error = false;


                try {

                    System.out.println("Figura [" + i +"]:");
                    System.out.println("    Valor da aresta XX");
                    Valor = reader.readLine();
                    xx = Float.parseFloat(Valor);

                } catch (IOException e) {
                    //           throw new RuntimeException(e);
                    System.err.println("Erro a obter o valor da aresta xx");
                    error = true;
                }

                if (!error) {
                    try {

                        System.out.println("    Valor da aresta YY");
                        Valor = reader.readLine();
                        yy = Float.parseFloat(Valor);

                    } catch (IOException e) {
                        System.err.println("Erro a obter o valor da aresta yy");
                        error = true;
                    }
                }

                if (!error) {
                    if ( xx > 0 && yy > 0 ) {

                        Figura = Shape2DFactory.criarfigura ( xx, yy);

                        figuras.add( Figura );

                    }


                }
            }

            System.out.println("As figuras introduzidas foram: ");
            for (Shape2D it: figuras) {
                it.descricao();
            }

        }

    }
}
