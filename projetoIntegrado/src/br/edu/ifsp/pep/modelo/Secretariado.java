
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "secretariado")
@NamedQueries({
    @NamedQuery(name = "Secretariado.findAll", query = "SELECT s FROM Secretariado s"),
    @NamedQuery(name = "Secretariado.findByCpf", query = "SELECT s FROM Secretariado s WHERE s.cpf = :cpf"),
})
public class Secretariado implements Serializable {

    @Id
    @Column(name = "cpf",length = 20, nullable = false)
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
    
    @Column(name = "funcao", length = 45, nullable = false)
    private String funcao;
    
    @Column(name = "salario", precision = 8, scale = 2, nullable = false)
    private BigDecimal salario;
    
    @Column(name = "login_nome", length = 45, nullable = false)
    private String loginNome;
    
    @Column(name = "login_senha", length = 45, nullable = false)
    private String loginSenha;
   

    public Secretariado() {
    }

    public Secretariado(String cpf) {
        this.cpf = cpf;
    }

    public Secretariado(String cpf, String nome, Date dataNascimento, String telefone, String email, String endereco, String funcao, BigDecimal salario, String loginNome, String loginSenha, boolean status) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.funcao = funcao;
        this.salario = salario;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Secretariado)) {
            return false;
        }
        Secretariado other = (Secretariado) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Secretariado[ cpf=" + cpf + " ]";
    }
    
}
