package com.entidades.classes.pessoas;

import com.entidades.classes.procedimentos.EnfermidadePessoal;
import com.entidades.classes.informacoes.Entrada;

import java.util.ArrayList;

public class Paciente extends Pessoa{
    private int idPaciente;
    private ArrayList<EnfermidadePessoal> doenca;
    private ArrayList<Entrada> historico;
    static int numPacientes = 0;

    {
        numPacientes++;
        doenca = new ArrayList<>();
        historico = new ArrayList<>();
    }

    public void setIdPaciente(int idPaciente){
        this.idPaciente = idPaciente;
    }
    public void setDoenca(EnfermidadePessoal doenca) {
        this.doenca.add(doenca);
    }
    public void setHistorico(Entrada entrada) {
        this.historico.add(entrada);
    }

    @Override
    public String toString() {
        int dia = this.historico.get((this.historico.size()) -1).getDiaEntrada();
        String mes = this.historico.get((this.historico.size() -1)).getMesEntrada();
        int ano = this.historico.get((this.historico.size() -1)).getAnoEntrada();
        return String.format("%s       %d/%s/%d", nome, dia, mes, ano);
    }
}
