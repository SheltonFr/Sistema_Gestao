package com.entidades.interfaces;

import com.entidades.classes.pessoas.Medico;
import com.entidades.classes.pessoas.Paciente;

import java.util.ArrayList;

public interface IGerente {

    // Armazenar os dados que todas as contas do tipo gerente devem ter em comum
     static ArrayList<Medico> medicos = new ArrayList<>();
     static ArrayList<Paciente> pacientes = new ArrayList<>();

    public abstract Medico cadastrarMedico();
    public abstract void listarMedicos();
    public abstract void verMedico(Medico medico);
   // public abstract void removerMedico();
    public abstract void registarPaciente();
    public abstract void listarPacientes();
   // public abstract void removerPaciente();
    public abstract void criarEntrada(Paciente paciente);

}
