/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author sabri
 */
@Embeddable
public class RemedioPK implements Serializable {

   
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "miligrama", length = 45, nullable = false)
    private String miligrama;

    public RemedioPK() {
    }

    public RemedioPK(String nome, String miligrama) {
        this.nome = nome;
        this.miligrama = miligrama;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMiligrama() {
        return miligrama;
    }

    public void setMiligrama(String miligrama) {
        this.miligrama = miligrama;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nome != null ? nome.hashCode() : 0);
        hash += (miligrama != null ? miligrama.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RemedioPK)) {
            return false;
        }
        RemedioPK other = (RemedioPK) object;
        if ((this.nome == null && other.nome != null) || (this.nome != null && !this.nome.equals(other.nome))) {
            return false;
        }
        if ((this.miligrama == null && other.miligrama != null) || (this.miligrama != null && !this.miligrama.equals(other.miligrama))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.RemedioPK[ nome=" + nome + ", miligrama=" + miligrama + " ]";
    }
    
}
