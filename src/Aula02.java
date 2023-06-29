/*
* Classe da Aula2
* */

import aula02.data_types;

public class Aula02 {
    public static void main(String[] args) {
        System.out.println("Aula 02 >");

        static_inner_function();
    }

    public void inner_function() {
        System.out.println("inner_function >");
    }

    public static void static_inner_function() {
        System.out.println("static_inner_function >");

        data_types classDataTypes = new data_types();
        classDataTypes.printDataTypes();
    }
}

