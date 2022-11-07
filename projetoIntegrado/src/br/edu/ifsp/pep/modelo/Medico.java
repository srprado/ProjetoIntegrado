
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
    @NamedQuery(name = "Medico.findByNumeroRegistro", query = "SELECT m FROM Medico m WHERE m.numeroRegistro = :numeroRegistro"),
    @NamedQuery(name = "Medico.findByEspecialidade", query = "SELECT m FROM Medico m WHERE m.especialidade = :especialidade"),
    @NamedQuery(name = "Medico.findByLoginNome", query = "SELECT m FROM Medico m WHERE m.loginNome = :loginNome"),
    @NamedQuery(name = "Medico.findByLoginSenha", query = "SELECT m FROM Medico m WHERE m.loginSenha = :loginSenha")
})
public class Medico extends Pessoa{

    @Column(name = "numero_registro", length = 20, nullable = false)
    private String numeroRegistro;
   
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

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
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

    public Collection<Consulta> getConsultaCollection() {
        return consultaCollection;
    }

    public void setConsultaCollection(Collection<Consulta> consultaCollection) {
        this.consultaCollection = consultaCollection;
    }
    
}
