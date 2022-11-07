
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByStatus", query = "SELECT c FROM Cliente c WHERE c.status = :status")})
public class Cliente extends Pessoa{
    
    @OneToMany(mappedBy = "titularCpf")
    private Collection<Cliente> clienteCollection;
    
    @JoinColumn(name = "titular_cpf", referencedColumnName = "cpf")
    @ManyToOne
    private Cliente titularCpf;
    
    @JoinColumns({
        @JoinColumn(name = "idplano_medico", referencedColumnName = "idplano_medico", nullable = false)})    
    @ManyToOne()
    private PlanoMedico planoMedico;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private Collection<Exame> exameCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private Collection<Pagamento> pagamentoCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteCpf")
    private Collection<Consulta> consultaCollection;

    public Cliente() {
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    public Cliente getTitularCpf() {
        return titularCpf;
    }

    public void setTitularCpf(Cliente titularCpf) {
        this.titularCpf = titularCpf;
    }

    public PlanoMedico getPlanoMedico() {
        return planoMedico;
    }

    public void setPlanoMedico(PlanoMedico planoMedico) {
        this.planoMedico = planoMedico;
    }

    public Collection<Exame> getExameCollection() {
        return exameCollection;
    }

    public void setExameCollection(Collection<Exame> exameCollection) {
        this.exameCollection = exameCollection;
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
