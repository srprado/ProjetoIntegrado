
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plano_medico")
public class PlanoMedico implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPlano_medico")
    private long idPlanoMedico;
    
    @Column(name = "tipo_plano", length = 45, nullable = false)
    private String tipoPlano;
    
    @Column(name = "valor", precision = 6, scale = 2, nullable = false)
    private BigDecimal valor;

    public PlanoMedico() {
    }

    public long getIdPlanoMedico() {
        return idPlanoMedico;
    }

    public void setIdPlanoMedico(long idPlanoMedico) {
        this.idPlanoMedico = idPlanoMedico;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }    
}
