package com.entidades.classes.informacoes;

import com.entidades.classes.procedimentos.Enfermidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Relatorio {
    private String comentarioMedico;
    private float peso;
    private float altura;
    private ArrayList<Enfermidade> doenca;

    {
        doenca = new ArrayList<>();
    }

    public Relatorio(){}

    public String mostrarRelatorio(){
        return String.format("Peso: %.3f%nAltura: %.2f%nComentario Medico:%n%s%n", peso,altura, comentarioMedico);
    }



    public String getComentarioMedico() {
        return comentarioMedico;
    }

    public void setComentarioMedico(String comentarioMedico) {
        this.comentarioMedico = comentarioMedico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public ArrayList<Enfermidade> getDoenca() {
        return doenca;
    }

    public void setDoenca(ArrayList<Enfermidade> doenca) {
        this.doenca = doenca;
    }
}
