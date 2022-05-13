package com.entidades.aplicacaoPrincipal;
import java.util.Scanner;
import com.entidades.classes.pessoas.Gerente;

public class Estrutura {

    Scanner sc;
    Gerente gerente;

    {
        gerente = new Gerente();
        sc = new Scanner(System.in);
        criarGerente();
    }

    private void criarGerente(){
        System.out.println("-----CADASTRO DO GERENTE-----");
        gerente.criarGerente();
    }

    private void showFirstMenu(){
        System.out.println("------Menu Principal-------");
        System.out.println("1 - Cadastrar Medico");
        System.out.println("2 - Cadastrar Paciente");
        System.out.println("3 - Lista de pacientes");
        System.out.println("4 - Lista de Medicos");
    }

    public void choiceFirstMenu(){

        int choice = 0;

        while (choice != 5){
            showFirstMenu();
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    gerente.cadastrarMedico();
                    break;
                case 2:
                    gerente.registarPaciente();
                    break;
                case 3:
                    gerente.listarPacientes();
                    break;
                case 4:
                    gerente.listarMedicos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
}
