
package br.edu.ifsp.pep.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa{
    
    @ManyToOne
    @JoinColumn(name = "idPlano_medico")
    private PlanoMedico planoMedico;
    
    @OneToMany(mappedBy = "clienteCpf")
    private List<Consulta> consultas;
    
    @OneToMany(mappedBy = "clienteCpf")
    private List<Pagamento> pagamentos;

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public PlanoMedico getPlanoMedico() {
        return planoMedico;
    }

    public void setPlanoMedico(PlanoMedico planoMedico) {
        this.planoMedico = planoMedico;
    }
    
}
