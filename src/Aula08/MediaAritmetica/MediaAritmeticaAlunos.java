package Aula08.MediaAritmetica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaAritmeticaAlunos {
    /*
ALUNO, PORTUGUES, MATEMATICA, HISTORIA
sergio, 5, 14, 18
rui, 10, 8, 20
nuno, 14,20, 3
daniela, 10,18,9
tiago, 15, 1, 20

     */

    public static void main(String[] args) throws FileNotFoundException {

        String Nome;
        int NotaPortugues;
        int NotaMatematica;
        int NotaHistoria;

        InputStream stream = new FileInputStream(new File("c:\\work\\NotasAlunos.csv"));
//        InputStream stream = System.in;

        Scanner scanner = new Scanner(stream);

        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        // descartar a primeira linha
        scanner.nextLine();

        while (scanner.hasNextLine()){
            String value = scanner.nextLine();
            System.out.println(value);

            Nome = value.split(",")[0];
            String valor = value.split(",")[1];
            NotaPortugues = Integer.parseInt(value.split(",")[1].trim());
            NotaMatematica = Integer.parseInt(value.split(",")[2].trim());
            NotaHistoria = Integer.parseInt(value.split(",")[3].trim());


            Aluno aluno= new Aluno(Nome,NotaPortugues,NotaMatematica,NotaHistoria);
            listaAlunos.add(aluno);

        }

        for(Aluno current : listaAlunos){
            System.out.println("A média aritmética do aluno \t"
                            + current.getNome()
                            +"\t é de\t"
                            + String.valueOf(current.get_media()) );
        }
    }


}
