package bean;

import java.time.LocalDateTime;

public class InvitoBean {

    private int id;
    private String nomeShowcase;
    private LocalDateTime dataShowcase;
    private String tipoShowcase;

    public void  setId(int invitoID) {
        this.id = invitoID;
    }

    public int getId() {
        return id;
    }

    public void setNomeShowcase(String nomeShowcase) {
        this.nomeShowcase = nomeShowcase;
    }

    public String getNomeShowcase() {
        return nomeShowcase;
    }

    public void setDataShowcase(LocalDateTime dataShowcase) {
        this.dataShowcase = dataShowcase;
    }

    public LocalDateTime getDataShowcase() {
        return dataShowcase;
    }

    public void setTipoShowcase(String tipoShowcase) {
        this.tipoShowcase = tipoShowcase;
    }

    public String getTipoShowcase() {
        return tipoShowcase;
    }
}
