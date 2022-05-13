package com.entidades.classes.pessoas;

import com.entidades.classes.Funcionario;
import com.entidades.classes.informacoes.Relatorio;
import com.entidades.interfaces.IMedico;

public class Medico extends Funcionario implements IMedico {
    private int numRegisto;
    private String especialidade;
    static int numMedicos = 0;

    {
        numMedicos++;
    }

    public Medico(String nome, int idade, String sexo, String statusPessoa, String tipoSanguineo,
                  int numRegisto, String especialidade){

        super(nome, idade, sexo, statusPessoa, tipoSanguineo);
        this.numRegisto = numRegisto;
        this.especialidade = especialidade;
    }

    public Medico(){}
    //Metodos da classe

    @Override
    public void atenderPaciente(Paciente paciente){

    }

    @Override
    public void formularRelatorio(){
        Relatorio relatorio = new Relatorio();
    }

    public void showMenu(){
        System.out.println("1 - Registar paciente");
        System.out.println("2 - Atender Paciente");
        System.out.println("3 - Ver Lista de pacientes");
    }



    //Getters and Setters
    public void setNumRegisto(int numRegisto){
        this.numRegisto = numRegisto;
    }

    public int getNumRegisto(){
        return  this.numRegisto;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    @Override
    public String toString() {
        return "Numero de Registo: " + numRegisto +
                "\nEspecialidade: " + especialidade +
                "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo +
                "\nStatusPessoa: " + statusPessoa +
                "Tipo Sanguineo: " + tipoSanguineo;
    }
}
