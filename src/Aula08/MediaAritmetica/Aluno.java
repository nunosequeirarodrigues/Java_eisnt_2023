package Aula08.MediaAritmetica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aluno {
    private String Nome;
    private int NotaPortugues;
    private int NotaMatematica;
    private int NotaHistoria;

    public Aluno(String Nome, int NotaPortugues, int NotaMatematica, int NotaHistoria) {
        this.Nome = Nome;
        this.NotaPortugues = NotaPortugues;
        this.NotaMatematica = NotaMatematica;
        this.NotaHistoria = NotaHistoria;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getNotaPortugues() {
        return NotaPortugues;
    }

    public void setNotaPortugues(int notaPortugues) {
        NotaPortugues = notaPortugues;
    }

    public int getNotaMatematica() {
        return NotaMatematica;
    }

    public void setNotaMatematica(int notaMatematica) {
        NotaMatematica = notaMatematica;
    }

    public int getNotaHistoria() {
        return NotaHistoria;
    }

    public void setNotaHistoria(int notaHistoria) {
        NotaHistoria = notaHistoria;
    }


    public double get_media( ){
        Double valor = (double)(NotaMatematica+NotaHistoria+NotaPortugues)/(double) 3;
        BigDecimal bd;
        bd = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
        return   bd.doubleValue();

    }


}
