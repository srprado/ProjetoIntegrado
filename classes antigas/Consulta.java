
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
    @Column(name = "idConsulta")
    private long idConsulta;
    
    @Column(name = "dia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dia;
    
    @Column(name = "horario", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date horario;
    
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsulta")
    private Collection<Remedio> remedioCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idConsulta")
    private Collection<Exame> exameCollection;
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne
    private Cliente clienteCpf;
    
    @JoinColumn(name = "medico_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne
    private Medico medicoCpf;

    public Consulta() {
    }

    public Consulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Consulta(long idConsulta, Date dia, Date horario, boolean status) {
        this.idConsulta = idConsulta;
        this.dia = dia;
        this.horario = horario;
        this.status = status;
    }

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
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
        int hash = 7;
        hash = 17 * hash + (int) (this.idConsulta ^ (this.idConsulta >>> 32));
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
        final Consulta other = (Consulta) obj;
        return this.idConsulta == other.idConsulta;
    }

    
    
}
