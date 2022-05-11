package com.entidades.aplicacaoPrincipal;

import com.entidades.classes.pessoas.Gerente;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente g = new Gerente();

        int choise = 0;

        while (choise != 5){

            showMenu();
            choise = sc.nextInt();
            switch (choise){
                case 1:
                    g.cadastrarMedico();
                    break;
                case 2:
                    g.registarPaciente();
                    break;
                case 3:
                    g.listarMedicos();
                    break;
                case 4:
                    g.listarPacientes();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Invalido!");
            }
        }

    }

    public static void showMenu(){
        System.out.println("1 - Cadastrar Medico");
        System.out.println("2 - Registar Pacientes");
        System.out.println("3 - Ver lista de Medicos");
        System.out.println("4 - Ver lista de Pacientes");
    }
}
