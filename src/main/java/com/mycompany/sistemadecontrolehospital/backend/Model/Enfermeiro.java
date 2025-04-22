package com.mycompany.sistemadecontrolehospital.backend.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Enfermeiro extends AtendenteHospitalar {
    private static ArrayList<Enfermeiro> enfermeiroDb = new ArrayList() {{
        add(new Enfermeiro(
                "Enfermeiro 1",
                new Date(),
                new Endereco("Rua", 2, "sfa", "fasd", "fasd", 234234),
                new ContatoTelEmail("423423", "46453", "llgsd@gsdf.com"),
                Genero.Masculino,
                "rwe",
                42342,
                1L,
                true));
    }};
            
            
    
    
    private Long idEnfermeiro;
    private boolean treinadoOpRX;

    public Enfermeiro(String nomeCompleto, Date UTC, Endereco endereco, ContatoTelEmail contato, Genero genero, String setor, int chSemanal, Long idEnfermeiro, boolean isTreinadoOpRX) {
        super(setor, chSemanal, nomeCompleto, UTC, endereco, contato, genero);
        
        this.idEnfermeiro = idEnfermeiro;
        this.treinadoOpRX = isTreinadoOpRX;
    }

    public Long getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public void setIdEnfermeiro(Long idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public boolean getIsTreinadoOpRX() {
        return treinadoOpRX;
    }

    public void setTreinadoOpRX(boolean treinadoOpRX) {
        this.treinadoOpRX = treinadoOpRX;
    }
    
    //Static
    
    public static ArrayList<Enfermeiro> getAll() {
        return Enfermeiro.enfermeiroDb;
    }
    
    public static Enfermeiro getById(Long id) {
        var result = Enfermeiro.enfermeiroDb.stream()
                .filter(x -> Objects.equals(x.getIdEnfermeiro(), id))
                .findFirst()
                .get();

        return result;
    }
    
    public static Long save(Enfermeiro enfermeiro) {
       var newId = DatabaseConstants.getModelId(ModelKey.Enfermeiro);
       enfermeiro.setIdEnfermeiro(newId);
       Enfermeiro.enfermeiroDb.add(enfermeiro);
       return newId;
    }
    
    public static void remove(Long id) {
       
       var newList = Enfermeiro.enfermeiroDb.stream()
               .filter(enfermeiro -> !Objects.equals(enfermeiro.idEnfermeiro, id)).toList();
       
       Enfermeiro.enfermeiroDb = (ArrayList) newList;
    }

    @Override
    public boolean equals(Object obj) {

        final Enfermeiro other = (Enfermeiro) obj;
        return Objects.equals(this.idEnfermeiro, other.idEnfermeiro);
    }
    
}
