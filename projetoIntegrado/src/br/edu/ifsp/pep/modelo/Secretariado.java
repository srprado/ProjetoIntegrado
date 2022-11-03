
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "secretariado")
@NamedQueries({
    @NamedQuery(name = "Secretariado.findAll", query = "SELECT s FROM Secretariado s"),
    @NamedQuery(name = "Secretariado.findByCpf", query = "SELECT s FROM Secretariado s WHERE s.cpf = :cpf"),
})
public class Secretariado extends Pessoa {
    
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
    
}
