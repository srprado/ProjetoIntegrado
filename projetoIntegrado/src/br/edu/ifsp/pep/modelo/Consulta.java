
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "consulta")
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByIdconsulta", query = "SELECT c FROM Consulta c WHERE c.idconsulta = :idconsulta"),
    @NamedQuery(name = "Consulta.findByDia", query = "SELECT c FROM Consulta c WHERE c.data = :data"),
    @NamedQuery(name = "Consulta.findByHorario", query = "SELECT c FROM Consulta c WHERE c.horario = :horario"),
    @NamedQuery(name = "Consulta.findByDiaeHora", query = "SELECT c FROM Consulta c WHERE c.data = :data AND c.horario = :horario"),
    @NamedQuery(name = "Consulta.findByStatus", query = "SELECT c FROM Consulta c WHERE c.status = :status"),
    @NamedQuery(name = "Consulta.findbyCliente", query = "SELECT c FROM Consulta c WHERE c.clienteCpf = :clienteCpf"),
    @NamedQuery(name = "Consulta.findByDiaeMedico", query = "SELECT c FROM Consulta c WHERE c.data = :data AND c.medicoCpf = :medicoCpf"),
    @NamedQuery(name = "Consulta.findByDiaHoraeMedico", query = "SELECT c FROM Consulta c WHERE c.data = :data AND c.medicoCpf = :medicoCpf AND c.horario = :horario"),
    @NamedQuery(name = "Consulta.findbyMedico", query = "SELECT c FROM Consulta c WHERE c.medicoCpf = :medicoCpf"),
    @NamedQuery(name = "Consulta.findbyCliente", query = "SELECT c FROM Consulta c WHERE c.clienteCpf = :clienteCpf"),
    @NamedQuery(name = "Consulta.findbyClienteMedico", query = "SELECT c FROM Consulta c WHERE c.clienteCpf = :clienteCpf AND c.medicoCpf = :medicoCpf")
    

})
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconsulta")
    private Integer idconsulta;

    @Column(name = "data", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "horario", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horario;
    
    @Column(name = "tipo", length = 45, nullable = false)
    private String tipo;

    @Column(name = "status", nullable = false)
    private boolean status;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Idconsulta")
    private Collection<Exame> exameCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Idconsulta")
    private Collection<Receita> receitaCollection;
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne(optional = false)
    private Cliente clienteCpf;
    
    @JoinColumn(name = "medico_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne(optional = false)
    private Medico medicoCpf;

    public Consulta() {
    }

    public Integer getIdconsulta() {
        return idconsulta;
    }

    public void setIdconsulta(Integer idconsulta) {
        this.idconsulta = idconsulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }    

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   

    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Collection<Exame> getExameCollection() {
        return exameCollection;
    }

    public void setExameCollection(Collection<Exame> exameCollection) {
        this.exameCollection = exameCollection;
    }

    public Collection<Receita> getReceitaCollection() {
        return receitaCollection;
    }

    public void setReceitaCollection(Collection<Receita> receitaCollection) {
        this.receitaCollection = receitaCollection;
    }

    public Cliente getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(Cliente clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public Medico getMedicoCpf() {
        return medicoCpf;
    }

    public void setMedicoCpf(Medico medicoCpf) {
        this.medicoCpf = medicoCpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsulta != null ? idconsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.idconsulta == null && other.idconsulta != null) || (this.idconsulta != null && !this.idconsulta.equals(other.idconsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Consulta[ idconsulta=" + idconsulta + " ]";
    }
    
}
