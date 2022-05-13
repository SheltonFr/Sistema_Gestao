package com.entidades.aplicacaoPrincipal;

import com.entidades.classes.pessoas.Gerente;
import com.entidades.classes.pessoas.Medico;

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxo {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Gerente> gerentes;
    private ArrayList<Medico> medicos;
    Gerente g  = new Gerente();

    {
        gerentes = new ArrayList<>();
        medicos = new ArrayList<>();
        this.start();

    }

    public void start(){

        int choice = 0;
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



    //No gerente

    public void criarMedico(){
        this.medicos.add(g.cadastrarMedico());
        this.start();
    }


    public void validarLoginGerente(String userneme, String senha){

        Gerente activo = null;
        for(Gerente g: gerentes){
            if(g.getLogin().equals(userneme) && g.getSenha().equals(senha)){
                activo = g;
                break;
            }
        }

        if(activo != null){
            usarGerente(activo);
        }else{
            System.out.println("Username e/ou senha invalidas!");
            this.start();

        }
    }

    public void usarMedico(Medico activo){
        activo.showMenu();
    }

    public void usarGerente(Gerente activo){
        activo.showMenu();
    }


    // Receber dados de login do gerente
    public void loginGerente(){
        System.out.println("Username: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String senha = sc.next();

        validarLoginGerente(username, senha);
    }

    // Validar Login do gerente, e abrir o menu do gerente


    // Criar gerente, e armazenar no arrat de gerentes
    public void criarGerente(){
        Gerente g = new Gerente();
        g.criarGerente();
        gerentes.add(g);
        this.start();
    }

    //Medico
    public void loginMedico(){
        System.out.println("Username: ");
        String username = sc.next();

        System.out.println("Senha: ");
        String senha = sc.next();

        validarLoginMedico(username, senha);
    }

    public void validarLoginMedico(String userneme, String senha){

        Medico activo = null;
        for(Medico g: medicos){
            if(g.getLogin().equals(userneme) && g.getSenha().equals(senha)){
                activo = g;
                break;
            }
        }

        if(activo != null){
            usarMedico(activo);
        }else{
            System.out.println("Username e/ou senha invalidas!");
            this.start();

        }
    }

    //Acoes de escolhas de Menus
    //startMenu()
    public void escolherGerente(){
        if(gerentes.size() == 0){
            System.out.println("Sem contas Cadastradas! ");
            System.out.println("Crie uma conta.");
            this.criarGerente();
        }else{
            int choice =0;
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
        if(medicos.size() == 0){
            System.out.println("Sem contas Cadastradas! ");
            System.out.println("\nOs medicos devem ser cadastrados pelos Gerentes\n");
            this.start();
        }else{
                System.out.println("PAGINA DE LOGIN");
                this.loginMedico();
        }
    }

    // Menus
    public void startMenu(){
        System.out.println("Entrar como: ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Medico");
        System.out.println("3 - Fechar");
    }

    public void menuOpcaoLoginGerete(){
        System.out.println("1 - Efctuar novo cadastro. ");
        System.out.println("2 - Usar conta existente. ");
    }

}
