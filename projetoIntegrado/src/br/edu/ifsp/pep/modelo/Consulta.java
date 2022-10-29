
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name = "consulta")
public class Consulta implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private long idConsulta;
    
    @Column(name = "dia", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dia;
    
    @Column(name = "horario", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horario;    
//Date dataHoraAtual = new Date();
//String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
//String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual); 
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name = "cliente_cpf")
    private Cliente clienteCpf;
    
    @ManyToOne
    @JoinColumn(name = "medico_cpf")
    private Medico medicoCpf;
    
    @OneToMany(mappedBy = "idConsulta")
    private List<Exame> exames;
    
    @OneToMany(mappedBy = "idConsulta")
    private List<Remedio> remedios;

    public Consulta() {
    }

    public Consulta(Date dia, Date horario, boolean status) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Remedio> getRemedios() {
        return remedios;
    }

    public void setRemedios(List<Remedio> remedios) {
        this.remedios = remedios;
    }
    
}
