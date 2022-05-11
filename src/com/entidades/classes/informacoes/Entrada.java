package com.entidades.classes.informacoes;


import java.util.ArrayList;

public class Entrada {
    private int idEntrada;
    private int diaEntrada;
    private String  mesEntrada;
    private int anoEntrada;
    ArrayList<Relatorio> situacaoPaciente;

    {
        situacaoPaciente = new ArrayList<>();
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getDiaEntrada() {
        return diaEntrada;
    }

    public void setDiaEntrada(int diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public String getMesEntrada() {
        return mesEntrada;
    }

    public void setMesEntrada(String mesEntrada) {
        this.mesEntrada = mesEntrada;
    }

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }
}
