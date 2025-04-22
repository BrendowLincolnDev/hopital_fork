package com.mycompany.sistemadecontrolehospital.backend.Model;
import java.util.ArrayList;
import java.util.Date;

public class Medico extends AtendenteHospitalar {
    private Long idMedico;
    private int numeroCRM;
    private ArrayList<String> areaEspecialidade = new ArrayList<>();
    private boolean cirurgiao;

    public Medico(String setor, int chSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero) {
        super(setor, chSemanal, nomeCompleto, dataNascimento, endereco, contato, genero);
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public int getNumeroCRM() {
        return numeroCRM;
    }

    public void setNumeroCRM(int numeroCRM) {
        this.numeroCRM = numeroCRM;
    }

    public ArrayList<String> getAreaEspecialidade() {
        return areaEspecialidade;
    }

    public void setAreaEspecialidade(ArrayList<String> areaEspecialidade) {
        this.areaEspecialidade = areaEspecialidade;
    }

    public boolean isCirurgiao() {
        return cirurgiao;
    }

    public void setCirurgiao(boolean cirurgiao) {
        this.cirurgiao = cirurgiao;
    }

  
    
    
}
