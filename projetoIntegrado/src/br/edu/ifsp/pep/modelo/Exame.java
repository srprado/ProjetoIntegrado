
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "exame")
public class Exame implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexame")
    private long idExame;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nomeExame;
    
    @Column(name = "tipo_exame", length = 45, nullable = false)
    private String tipoExame;
    
    //acrescentar chave estrangeira da consulta
    
    public Exame() {
    }

    public long getIdExame() {
        return idExame;
    }

    public void setIdExame(long idExame) {
        this.idExame = idExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }   
}
