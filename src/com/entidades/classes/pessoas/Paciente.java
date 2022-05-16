package com.entidades.classes.pessoas;

import com.entidades.classes.informacoes.Entrada;
import com.entidades.classes.informacoes.Relatorio;
import com.entidades.classes.procedimentos.Enfermidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Paciente extends Pessoa{
    private int idPaciente;
    private ArrayList<Enfermidade> doenca;
    private ArrayList<Entrada> historico;
    public Medico medico;
    static int numPacientes = 0;

    Scanner sc = new Scanner(System.in);
    {
        numPacientes++;
        doenca = new ArrayList<>();
        historico = new ArrayList<>();
    }

    public void mostrarDoenca(){
        if(doenca.size() == 0){
            System.out.println("Sem doencas registadas");
        }else{
            for (Enfermidade e: doenca){
                e.toString().concat("\n");
            }
        }
    }
    public void mostrarHistorico(){
        for(Entrada e: historico){
            e.mostrarEntrada();
        }
    }

    public void fazerRelatorio(){
        Relatorio r = new Relatorio();
        System.out.println("Peso do paciente: ");
        r.setPeso(sc.nextFloat());

        System.out.println("Altura do paciente: ");
        r.setAltura(sc.nextFloat());

        sc.next();
        System.out.println("Comentario Medico: ");
        r.setComentarioMedico(sc.nextLine());

        this.historico.get(historico.size()-1).situacaoPaciente.add(r);

    }

    public void setIdPaciente(int idPaciente){
        this.idPaciente = idPaciente;
    }
    public void setDoenca(Enfermidade doenca) {
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
