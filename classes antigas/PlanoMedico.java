
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
    @NamedQuery(name = "PlanoMedico.findByTipo", query = "SELECT p FROM PlanoMedico p WHERE p.tipoPlano = :tipoPlano")
})
public class PlanoMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    @Column(name = "idplano_medico")
    private long idplanoMedico;
    
    @Column(name = "tipo_plano", length = 45, nullable = false)
    private String tipoPlano;
    
    @Column(name = "valor_mensal", precision = 8, scale = 2, nullable = false)
    private BigDecimal valorMensal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planoMedico")
    private Collection<Cliente> clienteCollection;

    public PlanoMedico() {
    }

    public PlanoMedico(long idplanoMedico) {
        this.idplanoMedico = idplanoMedico;
    }    

    public PlanoMedico(long idplanoMedico, String tipoPlano, BigDecimal valorMensal) {
        this.idplanoMedico = idplanoMedico;
        this.tipoPlano = tipoPlano;
        this.valorMensal = valorMensal;
    }

    public long getIdplanoMedico() {
        return idplanoMedico;
    }

    public void setIdplanoMedico(long idplanoMedico) {
        this.idplanoMedico = idplanoMedico;
    }   

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
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
        int hash = 5;
        hash = 79 * hash + (int) (this.idplanoMedico ^ (this.idplanoMedico >>> 32));
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
        final PlanoMedico other = (PlanoMedico) obj;
        return this.idplanoMedico == other.idplanoMedico;
    }    
}
