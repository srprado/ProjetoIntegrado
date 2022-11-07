
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
@Table(name = "exame")
@NamedQueries({
    @NamedQuery(name = "Exame.findAll", query = "SELECT e FROM Exame e"),
    @NamedQuery(name = "Exame.findByIdexame", query = "SELECT e FROM Exame e WHERE e.idexame = :idexame"),
})
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idexame")
    private Integer idexame;

    @Column(name = "descricao_exame", length = 150, nullable = false)
    private String descricaoExame;
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne(optional = false)
    private Cliente clienteCpf;
    
    @JoinColumn(name = "consulta_idconsulta", referencedColumnName = "idconsulta", nullable = false)
    @ManyToOne(optional = false)
    private Consulta Idconsulta;

    public Exame() {
    }

    public Exame(Integer idexame) {
        this.idexame = idexame;
    }

    public Exame(Integer idexame, String descricaoExame) {
        this.idexame = idexame;
        this.descricaoExame = descricaoExame;
    }

    public Integer getIdexame() {
        return idexame;
    }

    public void setIdexame(Integer idexame) {
        this.idexame = idexame;
    }

    public String getDescricaoExame() {
        return descricaoExame;
    }

    public void setDescricaoExame(String descricaoExame) {
        this.descricaoExame = descricaoExame;
    }

    public Cliente getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(Cliente clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public Consulta getIdconsulta() {
        return Idconsulta;
    }

    public void setIdconsulta(Consulta Idconsulta) {
        this.Idconsulta = Idconsulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexame != null ? idexame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exame)) {
            return false;
        }
        Exame other = (Exame) object;
        if ((this.idexame == null && other.idexame != null) || (this.idexame != null && !this.idexame.equals(other.idexame))) {
            return false;
        }
        return true;
    }
    
}
