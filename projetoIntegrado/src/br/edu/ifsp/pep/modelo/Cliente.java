
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
})
public class Cliente extends Pessoa {      
    
    @JoinColumn(name = "idplano_medico", referencedColumnName = "idplano_medico", nullable = false)        
    @ManyToOne
    private PlanoMedico planoMedico;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private Collection<Pagamento> pagamentoCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private Collection<Consulta> consultaCollection;

    public Cliente() {
    }    

    public PlanoMedico getPlanoMedico() {
        return planoMedico;
    }

    public void setPlanoMedico(PlanoMedico planoMedico) {
        this.planoMedico = planoMedico;
    }

    public Collection<Pagamento> getPagamentoCollection() {
        return pagamentoCollection;
    }

    public void setPagamentoCollection(Collection<Pagamento> pagamentoCollection) {
        this.pagamentoCollection = pagamentoCollection;
    }

    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
    }
    
    
}
