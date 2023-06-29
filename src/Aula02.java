/*
* Classe da Aula2
* */

import aula02.data_types;
import aula02.veiculo.Carro;

public class Aula02 {

    //Constantes

    // Variáveis

    // Construtor
    Aula02(){

    }

    // funções de classe

    public static void main(String[] args) {
        System.out.println("Aula 02 >");

        static_inner_function();

        int resultado = adicionar( 2 ,  4 );

        System.out.printf("Resultado: %d \n", resultado);

        veiculo( );
    }

    public static void static_inner_function() {
        System.out.println("static_inner_function >");

        data_types classDataTypes = new data_types();
        classDataTypes.printDataTypes();
    }

    public static int adicionar(int x, int y){
        return x + y;
    }

    public static void veiculo( ){
        Carro carro = new Carro( );
        carro.display_characteristics();
    }
    // métodos do objeto

    public void inner_function() {
        System.out.println("inner_function >");
    }


}

