package com.entidades.classes.pessoas;


import com.entidades.interfaces.IMedico;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Gerente implements IMedico {
    public ArrayList<Paciente> pacientes;
    private int numRegisto;
    private String especialidade;
    static int numMedicos = 0;

    {
        numMedicos++;
        pacientes = new ArrayList<>();
    }

    @Override
    public Paciente marcarConsulta(){
        return super.registarPaciente();
    }

    @Override
    public void atenderPaciente(Paciente paciente){
        int choice = 0;
        String ops;
        while (choice != 5){
            this.menuAtendimento();
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    paciente.mostrarHistorico();
                    break;
                case 2:
                    paciente.mostrarDoenca();
                    break;
                case 3:
                    paciente.fazerRelatorio();
                    break;
                case 4:
                    paciente = null;
                    choice = 5;
                    System.out.println("Atendimento Cancelado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public void listarPacientes(){
        if(Gerente.pacientes.size() == 0){
            System.out.println("Nao ha pacientes registados");
        }else{
            int i =1;
            System.out.println("Nome          Data de Entrada");
            for(Paciente p: Gerente.pacientes){
                System.out.println(i + " - " + p.toString());
                i++;
            }
        }
    }

    public void meusPacientes(){
        if(this.pacientes.size() == 0){
            System.out.println("Nao ha pacientes registados");
        }else{
            System.out.println("-----Seus Pacientes-----");
            int i =1;
            System.out.println("Nome          Data de Entrada");
            for(Paciente p: this.pacientes){
                System.out.println(i + " - " + p.toString());
                i++;
            }
        }
    }
    public void showMenu(){
        System.out.println("------Menu Medico-------");
        System.out.println("1 - Atender paciente.");
        System.out.println("2 - Lista de pacientes.");
        System.out.println("3 - Meus Pacientes..");
        System.out.println("4 - Marcar consultas.");
        System.out.println("5 - Ver Perfil.");
        System.out.println("6 - Terminar seccao.");
    }
    public void menuAtendimento(){
        System.out.println("1 - Ver Historico");
        System.out.println("2 - Ver Doencas ");
        System.out.println("3 - Fazer relatorio");
        System.out.println("4 - Cancelar atendimento");
    }

    // Escolher o paciente a ser atendido apartir de uma lista numerada
    public Paciente escolherPaciente(){
        this.listarPacientes();
        System.out.println("Selecione o paciente a ser atendido: ");
        int i = sc.nextInt();
        return this.pacientes.get(i-1);
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
        return  String.format("nome: %s%nIdade: %d%nSexo: %s%nEspecialidade: %s%n",
                nome, idade, sexo, especialidade);
    }
}
