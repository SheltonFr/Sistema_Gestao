package com.entidades.classes.pessoas;

import com.entidades.classes.informacoes.Entrada;
import com.entidades.interfaces.IGerente;

import java.util.Scanner;

public class Gerente extends Funcionario implements IGerente{

    Scanner sc  = new Scanner(System.in);

    public void criarGerente(){

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
        medico.setLogin(sc.next());

        System.out.println("Insira uma Senha: ");
        medico.setSenha(sc.next());

        System.out.println("Nome: ");
        medico.nome = sc.nextLine();
        sc.nextLine();

        System.out.println("Idade: ");
        medico.idade = sc.nextInt();

        System.out.println("Sexo: ");
        medico.sexo = sc.next();


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
            }
        }
    }

    @Override
    public Paciente registarPaciente(){
        Paciente paciente = new Paciente();

        System.out.println("Nome: ");
        paciente.nome = sc.next();

        System.out.println("Idade: ");
        paciente.idade = sc.nextInt();

        System.out.println("Sexo: ");
        paciente.sexo = sc.next();

        System.out.println("Tipo sanguineo: ");
        paciente.tipoSanguineo = sc.next();

       paciente.setIdPaciente(Paciente.numPacientes);
       criarEntrada(paciente);
       pacientes.add(paciente);
       return paciente;
    }
    @Override
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
    @Override
    public void criarEntrada(Paciente paciente){
        Entrada entrada = new Entrada();

        System.out.println("Dados de entrada: ");
        System.out.print("Dia: ");
        entrada.setDiaEntrada(sc.nextInt());

        System.out.print("Mes: ");
        entrada.setMesEntrada(sc.next());
        System.out.print("Ano: ");
        entrada.setAnoEntrada(sc.nextInt());

        paciente.setHistorico(entrada);
    }
    @Override
    public String toString() {
        return String.format("Nome: %s%nIdade: %d%nTipo de conta: Gerente", this.nome, this.idade);
    }
    public void showMenu(){
        System.out.println("------Menu Gerente-------");
        System.out.println("1 - Cadastrar Medico.");
        System.out.println("2 - Registar Paciente.");
        System.out.println("3 - Lista de pacientes.");
        System.out.println("4 - Lista de Medicos.");
        System.out.println("5 - Perfil do gerente.");
        System.out.println("6 - Terminar seccao.");
    }
}
