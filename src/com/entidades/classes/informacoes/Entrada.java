package com.entidades.classes.informacoes;


import java.util.ArrayList;

public class Entrada {
    private int diaEntrada;
    private String  mesEntrada;
    private int anoEntrada;
    public  ArrayList<Relatorio> situacaoPaciente;

    {
        situacaoPaciente = new ArrayList<>();
    }



    public void mostrarEntrada(){
        System.out.printf("Data: %d/%s/%d%n", diaEntrada,mesEntrada,anoEntrada);
        exibirSituacao();

    }

    public void exibirSituacao(){
        if(this.situacaoPaciente.size() == 0){
            System.out.println("Nao ha diagnosticos registados");
        }else{
            for(Relatorio r: situacaoPaciente){
                r.mostrarRelatorio();
            }
        }
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
