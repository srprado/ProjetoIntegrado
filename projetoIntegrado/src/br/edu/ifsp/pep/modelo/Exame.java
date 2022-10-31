
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "exame")
@NamedQueries({
    @NamedQuery(name = "Exame.findAll", query = "SELECT e FROM Exame e"),
    @NamedQuery(name = "Exame.findByNome", query = "SELECT e FROM Exame e WHERE e.nome = :nome"),
    @NamedQuery(name = "Exame.findByTipoExame", query = "SELECT e FROM Exame e WHERE e.tipoExame = :tipoExame")})
public class Exame implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "idexame")
    private Integer idexame;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "tipo_exame", length = 45, nullable = false)
    private String tipoExame;
    
    @JoinColumn(name = "consulta_id", referencedColumnName = "id")
    @ManyToOne
    private Consulta consultaId;

    public Exame() {
    }

    public Exame(Integer idexame, String nome, String tipoExame) {
        this.idexame = idexame;
        this.nome = nome;
        this.tipoExame = tipoExame;
    }

    public Integer getIdexame() {
        return idexame;
    }

    public void setIdexame(Integer idexame) {
        this.idexame = idexame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public Consulta getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Consulta consultaId) {
        this.consultaId = consultaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idexame != null ? idexame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exame)) {
            return false;
        }
        Exame other = (Exame) object;
        if ((this.idexame == null && other.idexame != null) || (this.idexame != null && !this.idexame.equals(other.idexame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Exame[ idexame=" + idexame + " ]";
    }
    
}
