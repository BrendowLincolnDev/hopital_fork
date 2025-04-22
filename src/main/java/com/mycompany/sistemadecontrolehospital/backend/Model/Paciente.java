package com.mycompany.sistemadecontrolehospital.backend.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente extends DadoPessoal {
    
    private Long idPaciente; //Perguntar ao Brendow
    private int idade;
    private Date dataCadastro;
    private String obsGeral;
//    private ArrayList<ConsultaMedica> historicoConsultasMedicas = new ArrayList<>();
    //private ArrayList<String> historicoConsultasMedicas;
    //private ContatoTelEmail_Responsavel contatoResponsavel; //Perguntar ao Brendow
    private Responsavel contatoResponsavel;
    public Paciente(String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObsGeral() {
        return obsGeral;
    }

    public void setObsGeral(String obsGeral) {
        this.obsGeral = obsGeral;
    }

//    public List<ConsultaMedica> getHistoricoConsultasMedicas() {
//        return historicoConsultasMedicas;
//    }

//    public void setHistoricoConsultasMedicas(List<ConsultaMedica> historicoConsultasMedicas) {
//        this.historicoConsultasMedicas = historicoConsultasMedicas;
//    }

    public Responsavel getContatoResponsavel() {
        return contatoResponsavel;
    }

    public void setContatoResponsavel(Responsavel contatoResponsavel) {
        this.contatoResponsavel = contatoResponsavel;
    }
    
    
}
