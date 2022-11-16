
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
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
    @NamedQuery(name = "Secretariado.findByNome", query = "SELECT s FROM Secretariado s WHERE UPPER(s.nome) LIKE UPPER (:nome)"),
    @NamedQuery(name = "Secretariado.findAll", query = "SELECT s FROM Secretariado s"),
    @NamedQuery(name = "Secretariado.findByCpf", query = "SELECT s FROM Secretariado s WHERE s.cpf = :cpf"),
    @NamedQuery(name = "Secretariado.findByStatus", query = "SELECT s FROM Secretariado s WHERE s.status = :status"),
    @NamedQuery(name = "Secretariado.findByFuncao", query = "SELECT s FROM Secretariado s WHERE s.funcao = :funcao"),
    @NamedQuery(name = "Secretariado.findByLoginNome", query = "SELECT s FROM Secretariado s WHERE s.loginNome = :loginNome"),
    @NamedQuery(name = "Secretariado.findByLoginSenha", query = "SELECT s FROM Secretariado s WHERE s.loginSenha = :loginSenha")})
public class Secretariado extends Pessoa{

    @Column(name = "funcao", length = 45, nullable = false)
    private String funcao;

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
