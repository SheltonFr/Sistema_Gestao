package com.entidades.classes.pessoas;

import com.entidades.classes.informacoes.Entrada;
import com.entidades.interfaces.IGerente;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente implements IGerente{

    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;

    public Gerente(){
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
    }

    Scanner sc  = new Scanner(System.in);

    @Override
    public void cadastrarMedico(){
        Medico medico = new Medico();

        System.out.println("Nome: ");
        medico.nome = sc.next();

        System.out.println("Idade: ");
        medico.idade = sc.nextInt();

        System.out.println("Sexo[M/F]: ");
        medico.sexo = sc.next();

        System.out.println("Tipo sanguineo: ");
        medico.tipoSanguineo = sc.next();

        medico.setNumRegisto(Medico.numMedicos);

        medicos.add(medico);


    }

    @Override
    public void verMedico(Medico medico){
        System.out.println(medico.toString());
    }

    @Override
    public void listarMedicos(){
        if(this.medicos.size() == 0){
            System.out.println("Registo Vazio!");
        }else {
            for(Medico m: medicos){
                verMedico(m);
            };
        }
    }

    @Override
    public void registarPaciente(){
        Paciente paciente = new Paciente();

        System.out.println("Nome: ");
        paciente.nome = sc.next();

        System.out.println("Idade: ");
        paciente.idade = sc.nextInt();

        System.out.println("Sexo[M/F]: ");
        paciente.sexo = sc.next();

        System.out.println("Tipo sanguineo: ");
        paciente.tipoSanguineo = sc.next();

       paciente.setIdPaciente(Paciente.numPacientes);
       criarEntrada(paciente);
       pacientes.add(paciente);


    }

    @Override
    public void verPaciente(Paciente paciente){
        System.out.println(paciente.toString());
    }

    @Override
    public void listarPacientes(){
        if(this.pacientes.size() == 0){
            System.out.println("Nao ha pacientes registados");
        }else{
            for(Paciente p: pacientes){
                verPaciente(p);
            }
        }
    }

    @Override
    public void criarEntrada(Paciente paciente){
        Entrada entrada = new Entrada();

        entrada.setIdEntrada(1);
        System.out.println("Dados de entrada: ");
        System.out.print("Dia: ");
        entrada.setDiaEntrada(sc.nextInt());

        System.out.print("Mes: ");
        entrada.setMesEntrada(sc.next());
        System.out.print("Ano: ");
        entrada.setAnoEntrada(sc.nextInt());

        paciente.setHistorico(entrada);
    }
}
