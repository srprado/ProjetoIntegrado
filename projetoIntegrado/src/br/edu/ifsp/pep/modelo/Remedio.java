
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "remedio")
@NamedQueries({
    @NamedQuery(name = "Remedio.findAll", query = "SELECT r FROM Remedio r"),
    @NamedQuery(name = "Remedio.findByNome", query = "SELECT r FROM Remedio r WHERE r.remedioPK.nome = :nome"),
    @NamedQuery(name = "Remedio.findByMiligrama", query = "SELECT r FROM Remedio r WHERE r.remedioPK.miligrama = :miligrama"),
    @NamedQuery(name = "Remedio.findByFaixaEtaria", query = "SELECT r FROM Remedio r WHERE r.faixaEtaria = :faixaEtaria"),
})
public class Remedio implements Serializable {

    @EmbeddedId
    protected RemedioPK remedioPK;
    
    @Column(name = "faixa_etaria", length = 45, nullable = false)
    private String faixaEtaria;
   
    @Column(name = "data_vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
  
    @Column(name = "posologia", length = 45, nullable = false)
    private String posologia;
    
    @JoinColumn(name = "consulta_id", referencedColumnName = "id")
    @ManyToOne
    private Consulta consultaId;

    public Remedio() {
    }

    public RemedioPK getRemedioPK() {
        return remedioPK;
    }

    public void setRemedioPK(RemedioPK remedioPK) {
        this.remedioPK = remedioPK;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public Consulta getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Consulta consultaId) {
        this.consultaId = consultaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (remedioPK != null ? remedioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remedio)) {
            return false;
        }
        Remedio other = (Remedio) object;
        if ((this.remedioPK == null && other.remedioPK != null) || (this.remedioPK != null && !this.remedioPK.equals(other.remedioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Remedio[ remedioPK=" + remedioPK + " ]";
    }
    
}
