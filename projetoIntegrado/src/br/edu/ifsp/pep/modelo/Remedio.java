/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "remedio")
@IdClass(RemedioPK.class)
public class Remedio implements Serializable {
    
    @Id
    @Column(name = "nome", length = 45, nullable = false)
    private String nomeRemedio;
    
    @Id
    @Column(name = "miligrama", length = 45,  nullable = false)
    private String miligrama;
    
    @Column(name = "faixa_etaria", length = 45, nullable = false)
    private String faixaEtaria;
    
    //o modo de tomar o medicamento
    @Column(name = "posologia", length = 45, nullable = false)
    private String posologia;
    
    @Column(name = "data_vencimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;    
    
    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consulta idConsulta;
    
    public Remedio() {
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }  

    public String getMiligrama() {
        return miligrama;
    }

    public void setMiligrama(String miligrama) {
        this.miligrama = miligrama;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }   

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }
   
}
