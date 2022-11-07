
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "remedio")
@NamedQueries({
    @NamedQuery(name = "Remedio.findAll", query = "SELECT r FROM Remedio r"),
    @NamedQuery(name = "Remedio.findByIdremedio", query = "SELECT r FROM Remedio r WHERE r.idremedio = :idremedio"),
    @NamedQuery(name = "Remedio.findByNome", query = "SELECT r FROM Remedio r WHERE r.nome = :nome"),
})
public class Remedio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idremedio")
    private Integer idremedio;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "miligrama", length = 45, nullable = false)
    private String miligrama;

    @Column(name = "posologia", length = 45, nullable = false)
    private String posologia;

    @Column(name = "faixa_etaria", length = 45, nullable = false)
    private String faixaEtaria;

    @Column(name = "data_vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Idremedio")
    private Collection<Receita> receitaCollection;

    public Remedio() {
    }

    public Integer getIdremedio() {
        return idremedio;
    }

    public void setIdremedio(Integer idremedio) {
        this.idremedio = idremedio;
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

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
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

    public Collection<Receita> getReceitaCollection() {
        return receitaCollection;
    }

    public void setReceitaCollection(Collection<Receita> receitaCollection) {
        this.receitaCollection = receitaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idremedio != null ? idremedio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remedio)) {
            return false;
        }
        Remedio other = (Remedio) object;
        if ((this.idremedio == null && other.idremedio != null) || (this.idremedio != null && !this.idremedio.equals(other.idremedio))) {
            return false;
        }
        return true;
    }

}
