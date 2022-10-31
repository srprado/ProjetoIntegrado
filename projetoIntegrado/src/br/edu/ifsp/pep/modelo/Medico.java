
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "medico")
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m"),
    @NamedQuery(name = "Medico.findByCpf", query = "SELECT m FROM Medico m WHERE m.cpf = :cpf"),
})
public class Medico implements Serializable {

    @Id
    @Column(name = "cpf", length = 20, nullable = false)
    private String cpf;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
  
    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
    
    @Column(name = "email", length = 45, nullable = false)
    private String email;
    
    @Column(name = "endereco", length = 60, nullable = false)
    private String endereco;
    
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @Column(name = "crm", length = 20, nullable = false)
    private String crm;
    
    @Column(name = "especialidade", length = 45, nullable = false)
    private String especialidade;
    
    @Column(name = "login_nome", length = 45, nullable = false)
    private String loginNome;
   
    @Column(name = "login_senha", length = 45, nullable = false)
    private String loginSenha;    

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicoCpf")
    private Collection<Consulta> consultaCollection;

    public Medico() {
    }

    public Medico(String cpf, String nome, Date dataNascimento, String telefone, String email, String endereco, String crm, String especialidade, String loginNome, String loginSenha, boolean status) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.crm = crm;
        this.especialidade = especialidade;
        this.loginNome = loginNome;
        this.loginSenha = loginSenha;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLoginNome() {
        return loginNome;
    }

    public void setLoginNome(String loginNome) {
        this.loginNome = loginNome;
    }

    public String getLoginSenha() {
        return loginSenha;
    }

    public void setLoginSenha(String loginSenha) {
        this.loginSenha = loginSenha;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
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
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Medico[ cpf=" + cpf + " ]";
    }
    
}
