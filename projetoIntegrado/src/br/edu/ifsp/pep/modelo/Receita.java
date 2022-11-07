
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "receita")
@NamedQueries({
    @NamedQuery(name = "Receita.findAll", query = "SELECT r FROM Receita r"),
    @NamedQuery(name = "Receita.findByIdreceita", query = "SELECT r FROM Receita r WHERE r.idreceita = :idreceita"),
    @NamedQuery(name = "Receita.findByDescricao", query = "SELECT r FROM Receita r WHERE r.descricao = :descricao")})
public class Receita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceita")
    private Integer idreceita;
    
    @Column(name = "descricao", length = 150, nullable = false)
    private String descricao;
    
    @JoinColumn(name = "consulta_idconsulta", referencedColumnName = "idconsulta", nullable = false)
    @ManyToOne(optional = false)
    private Consulta Idconsulta;
    
    @JoinColumn(name = "remedio_idremedio", referencedColumnName = "idremedio", nullable = false)
    @ManyToOne(optional = false)
    private Remedio Idremedio;

    public Receita() {
    }

    public Receita(Integer idreceita) {
        this.idreceita = idreceita;
    }

    public Receita(Integer idreceita, String descricao) {
        this.idreceita = idreceita;
        this.descricao = descricao;
    }

    public Integer getIdreceita() {
        return idreceita;
    }

    public void setIdreceita(Integer idreceita) {
        this.idreceita = idreceita;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Consulta getIdconsulta() {
        return Idconsulta;
    }

    public void setIdconsulta(Consulta Idconsulta) {
        this.Idconsulta = Idconsulta;
    }

    public Remedio getIdremedio() {
        return Idremedio;
    }

    public void setIdremedio(Remedio Idremedio) {
        this.Idremedio = Idremedio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreceita != null ? idreceita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receita)) {
            return false;
        }
        Receita other = (Receita) object;
        if ((this.idreceita == null && other.idreceita != null) || (this.idreceita != null && !this.idreceita.equals(other.idreceita))) {
            return false;
        }
        return true;
    }

}
