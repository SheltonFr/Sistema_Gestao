package com.entidades.aplicacaoPrincipal;

import com.entidades.classes.pessoas.Gerente;
import com.entidades.classes.pessoas.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Gerente> gerentes;
    private ArrayList<Medico> medicos;
    //Gerente g  = new Gerente();

    {
        gerentes = new ArrayList<>();
        medicos = new ArrayList<>();
        this.start();
    }

    public void start(){

        int choice ;
            this.startMenu();
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    this.escolherGerente();
                    break;
                case 2:
                    this.escolherMedico();
                    break;
                case 3:
                    System.out.println("saindo");
                    break;
                default:
                    break;
            }


    }
    public void startMedico(Medico activo){
        activo.showMenu();
    }


    public void startGerente(Gerente activo){ //Quando logar o gerente()
        int choice = 0;
        String escolhas;
        while (choice != 6 && activo != null){
            activo.showMenu();
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    medicos.add(activo.cadastrarMedico());
                    System.out.println("Medico cadastrado com sucesso!");
                    break;
                case 2:
                    activo.registarPaciente();
                    break;
                case 3:
                    activo.listarPacientes();
                    break;
                case 4:
                    activo.listarMedicos();
                    break;
                case 5:
                    System.out.println(activo.toString());
                    break;
                default:
                    System.out.println("Opcao invalida!");

            }

            System.out.println("Voltar ao menu Gerente[s/n]?");
            escolhas = sc.next();
            if(escolhas.equalsIgnoreCase("s")){
                continue;
            }else{
                choice = 6;
            }
        }

        activo = null;
        System.out.println("Seccao terminada com sucesso!");
        this.start();
    }

    public void loginGerente(){
        System.out.println("Username: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String senha = sc.next();

        Gerente activo = null;
        for(Gerente g: gerentes){
            if(g.validarLogin(username,senha)){
                activo = g;
                break;
            }
        }
        if (activo != null){
           this.startGerente(activo);
        }else{
            System.out.println("Username e/ou senha invalidas");
            this.start();
        }

    }
    public void criarGerente(){
        System.out.println("------Pagina de Cadastro de geretes----");
        Gerente g = new Gerente();
        g.criarGerente();
        gerentes.add(g);
        this.start();
    }
    public void loginMedico(){
        System.out.println("Username: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String senha = sc.next();

        Medico activo = null;
        for(Medico m: medicos){
            if(m.validarLogin(username, senha)){
                 activo = m;
                 break;
            }
        }

        if(activo != null){
            this.startMedico(activo);
        }else{
            System.out.println("Username e/ou sehnha invalidas");
        }
    }
    public void escolherGerente(){
        if(gerentes.size() == 0){
            System.out.println("Sem contas Cadastradas! ");
            System.out.println("Crie uma conta.");
            this.criarGerente();
        }else{
            int choice;
            this.menuOpcaoLoginGerete();
            choice = sc.nextInt();
            if (choice == 1){
                this.criarGerente();
            }else{
                System.out.println("PAGINA DE LOGIN");
                this.loginGerente();
            }

        }
    }
    public void escolherMedico(){
        if(this.medicos.size() == 0){
            System.out.println("Sem contas Cadastradas! ");
            System.out.println("\nCadastre usando uma comta gerente\n");
            this.start();
        }else{
                System.out.println("PAGINA DE LOGIN");
                this.loginMedico();
        }
    }
    public void startMenu(){
        System.out.println("-------Entrar como:------");
        System.out.println("1 - Gerente");
        System.out.println("2 - Medico");
        System.out.println("3 - Fechar");
    }
    public void menuOpcaoLoginGerete(){
        System.out.println("1 - Efctuar novo cadastro. ");
        System.out.println("2 - Usar conta existente. ");
    }

}