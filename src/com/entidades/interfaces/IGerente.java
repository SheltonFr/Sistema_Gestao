package com.entidades.interfaces;

import com.entidades.classes.pessoas.Medico;
import com.entidades.classes.pessoas.Paciente;

public interface IGerente {
    public abstract void cadastrarMedico();
    public abstract void listarMedicos();
    public abstract void verMedico(Medico medico);
   // public abstract void removerMedico();
    public abstract void registarPaciente();
    public abstract void verPaciente(Paciente paciente);
    public abstract void listarPacientes();
   // public abstract void removerPaciente();
    public abstract void criarEntrada(Paciente paciente);
}
