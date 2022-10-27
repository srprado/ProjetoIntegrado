
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Objects;


public class RemedioPK  implements Serializable{
    
    private String nome;
    private String miligrama;

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
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.miligrama);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RemedioPK other = (RemedioPK) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.miligrama, other.miligrama);
    }   
}
