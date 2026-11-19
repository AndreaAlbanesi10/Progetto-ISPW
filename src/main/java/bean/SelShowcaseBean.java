package bean;

import java.time.LocalDateTime;

public class SelShowcaseBean {

    private String nome;
    private LocalDateTime data;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDateTime getData(){
        return data;
    }

    public void setData(LocalDateTime data){
        this.data = data;
    }
}
