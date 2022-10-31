
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
    @NamedQuery(name = "Consulta.findByDia", query = "SELECT c FROM Consulta c WHERE c.dia = :dia"),
    @NamedQuery(name = "Consulta.findByHorario", query = "SELECT c FROM Consulta c WHERE c.horario = :horario"),
    @NamedQuery(name = "Consulta.findByStatus", query = "SELECT c FROM Consulta c WHERE c.status = :status")})
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "dia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dia;
    
    @Column(name = "horario", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date horario;
    
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultaId")
    private Collection<Remedio> remedioCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultaId")
    private Collection<Exame> exameCollection;
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private Cliente clienteCpf;
    
    @JoinColumn(name = "medico_cpf", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private Medico medicoCpf;

    public Consulta() {
    }

    public Consulta(Integer id) {
        this.id = id;
    }

    public Consulta(Integer id, Date dia, Date horario, boolean status) {
        this.id = id;
        this.dia = dia;
        this.horario = horario;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Collection<Remedio> getRemedioCollection() {
        return remedioCollection;
    }

    public void setRemedioCollection(Collection<Remedio> remedioCollection) {
        this.remedioCollection = remedioCollection;
    }

    public Collection<Exame> getExameCollection() {
        return exameCollection;
    }

    public void setExameCollection(Collection<Exame> exameCollection) {
        this.exameCollection = exameCollection;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Consulta[ id=" + id + " ]";
    }
    
}
