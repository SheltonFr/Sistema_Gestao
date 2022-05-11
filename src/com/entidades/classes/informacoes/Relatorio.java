package com.entidades.classes.informacoes;

import com.entidades.classes.procedimentos.Enfermidade;

import java.util.ArrayList;

public class Relatorio {
    private int idRelatorio;
    private String comentarioEnfermeiro;
    private String comentarioMedico;
    private float peso;
    private float altura;
    private ArrayList<Enfermidade> doenca;

    {
        doenca = new ArrayList<>();
    }

    public Relatorio(int idRelatorio, String comentarioEnfermeiro, String comentarioMedico, float peso, float altura, ArrayList<Enfermidade> doenca) {
        this.idRelatorio = idRelatorio;
        this.comentarioEnfermeiro = comentarioEnfermeiro;
        this.comentarioMedico = comentarioMedico;
        this.peso = peso;
        this.altura = altura;
        this.doenca = doenca;
    }

    public Relatorio(){}

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getComentarioEnfermeiro() {
        return comentarioEnfermeiro;
    }

    public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
        this.comentarioEnfermeiro = comentarioEnfermeiro;
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
