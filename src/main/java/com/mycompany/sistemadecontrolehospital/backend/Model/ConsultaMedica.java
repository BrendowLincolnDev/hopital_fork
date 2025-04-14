package com.mycompany.sistemadecontrolehospital.backend.Model;

public class ConsultaMedica {
    private Long idConsulta;
    private Long idPaciente; //<<ref>> perguntar Brendow
    private Long idMedico;
    private String exameQueira;
    private String Diagnostico;
    private String precricao;
    private boolean indicacaoCirurgia;

    public ConsultaMedica(Long idConsulta, Long idPaciente, Long idMedico, String exameQueira, String Diagnostico, String precricao, boolean indicacaoCirurgia) {
        this.idConsulta = idConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.exameQueira = exameQueira;
        this.Diagnostico = Diagnostico;
        this.precricao = precricao;
        this.indicacaoCirurgia = indicacaoCirurgia;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getExameQueira() {
        return exameQueira;
    }

    public void setExameQueira(String exameQueira) {
        this.exameQueira = exameQueira;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getPrecricao() {
        return precricao;
    }

    public void setPrecricao(String precricao) {
        this.precricao = precricao;
    }

    public boolean isIndicacaoCirurgia() {
        return indicacaoCirurgia;
    }

    public void setIndicacaoCirurgia(boolean indicacaoCirurgia) {
        this.indicacaoCirurgia = indicacaoCirurgia;
    }
    
    
}
