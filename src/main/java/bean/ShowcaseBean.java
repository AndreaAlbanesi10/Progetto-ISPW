package bean;


import java.time.LocalDateTime;

public class ShowcaseBean {

    private String nome;
    private LocalDateTime data;
    private String tipo;
    private String nomeCampo;
    private String citta;
    private String immCampo;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getImmCampo() {
        return immCampo;
    }

    public void setImmCampo(String immCampo) {
        this.immCampo = immCampo;
    }

}
