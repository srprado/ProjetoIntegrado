
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

    @Id
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "nome")
    private String nome;

    @Column(name = "status")
    private boolean status;

    @Column(name = "telefone")
    private String telefone;
    
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

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, Date dataNascimento, String email, String endereco, String nome, boolean status, String telefone) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.status = status;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Cliente[ cpf=" + cpf + " ]";
    }
    
    
}
