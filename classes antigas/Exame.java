
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
    private long idexame;
    
    @Column(name = "nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "tipo_exame", length = 45, nullable = false)
    private String tipoExame;
    
    @JoinColumn(name = "consulta_id", referencedColumnName = "idConsulta")
    @ManyToOne
    private Consulta idConsulta;

    public Exame() {
    }

    public Exame(Integer idexame, String nome, String tipoExame) {
        this.idexame = idexame;
        this.nome = nome;
        this.tipoExame = tipoExame;
    }

    public long getIdexame() {
        return idexame;
    }

    public void setIdexame(long idexame) {
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

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (this.idexame ^ (this.idexame >>> 32));
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
        final Exame other = (Exame) obj;
        return this.idexame == other.idexame;
    }

    
}
