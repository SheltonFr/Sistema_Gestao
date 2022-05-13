package com.entidades.classes.pessoas;

import com.entidades.classes.Funcionario;
import com.entidades.classes.informacoes.Entrada;
import com.entidades.interfaces.IGerente;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario implements IGerente{
    private static ArrayList<Medico> medicos;
    private static ArrayList<Paciente> pacientes;

    public Gerente(){
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
    }

    Scanner sc  = new Scanner(System.in);

    public void criarGerente(){


        System.out.println("-----PAGINA DE CADASTRO DE GERENTES-----");

        System.out.println("Insira o Username: ");
        this.setLogin(sc.next());

        System.out.println("Insira a Senha: ");
        this.setSenha(sc.next());

        System.out.println("Nome: ");
        this.nome = sc.nextLine();
        sc.nextLine();

        System.out.println("Idade: ");
        this.idade = sc.nextInt();

        System.out.println("Sexo: ");
        this.sexo = sc.next();
    }

    @Override
    public Medico cadastrarMedico(){
        Medico medico = new Medico();

        System.out.println("Insira um Username: ");
        this.setLogin(sc.next());

        System.out.println("Insira uma Senha: ");
        this.setSenha(sc.next());

        System.out.println("Nome: ");
        medico.nome = sc.nextLine();
        sc.nextLine();

        System.out.println("Idade: ");
        medico.idade = sc.nextInt();

        System.out.println("Sexo[M/F]: ");
        medico.sexo = sc.next();

        System.out.println("Tipo sanguineo: ");
        medico.tipoSanguineo = sc.next();

        medico.setNumRegisto(Medico.numMedicos);

        medicos.add(medico);

        return medico;

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

    public void showMenu(){
        System.out.println("------Menu Principal-------");
        System.out.println("1 - Cadastrar Medico");
        System.out.println("2 - Cadastrar Paciente");
        System.out.println("3 - Lista de pacientes");
        System.out.println("4 - Lista de Medicos");
    }
}
