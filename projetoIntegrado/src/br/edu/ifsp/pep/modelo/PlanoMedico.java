
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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

@Entity
@Table(name = "plano_medico")
@NamedQueries({
    @NamedQuery(name = "PlanoMedico.findAll", query = "SELECT p FROM PlanoMedico p"),
    @NamedQuery(name = "PlanoMedico.findByIdplanoMedico", query = "SELECT p FROM PlanoMedico p WHERE p.idplanoMedico = :idplanoMedico"),
    @NamedQuery(name = "PlanoMedico.findByNome", query = "SELECT p FROM PlanoMedico p WHERE p.nome = :nome"),
})
public class PlanoMedico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idplano_medico")
    private Integer idplanoMedico;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "valor_mensal", precision = 8, scale = 2, nullable = false)
    private BigDecimal valorMensal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planoMedico")
    private Collection<Cliente> clienteCollection;

    public PlanoMedico() {
    }
    
    public Integer getIdplanoMedico() {
        return idplanoMedico;
    }

    public void setIdplanoMedico(Integer idplanoMedico) {
        this.idplanoMedico = idplanoMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(BigDecimal valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplanoMedico != null ? idplanoMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanoMedico)) {
            return false;
        }
        PlanoMedico other = (PlanoMedico) object;
        if ((this.idplanoMedico == null && other.idplanoMedico != null) || (this.idplanoMedico != null && !this.idplanoMedico.equals(other.idplanoMedico))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return nome;
    }

}
