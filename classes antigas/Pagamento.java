
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pagamento")
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p"),
})
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "idpagamento")
    private long idpagamento;
    
    @Column(name = "data_vencimento")
    @Temporal(TemporalType.DATE)    
    private Date dataVencimento;
    
    @Column(name = "data_pagamento")    
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    
    @Column(name = "valor_pago", precision = 8, scale = 2, nullable = false )
    private BigDecimal valorPago;
    
    @Column(name = "motivo_cancelamento", length = 60, nullable = false)
    private String motivoCancelamento;
    
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf", nullable = false)
    @ManyToOne
    private Cliente clienteCpf;

    public Pagamento() {
    }

    public Pagamento(long idpagamento) {
        this.idpagamento = idpagamento;
    }

    public Pagamento(long idpagamento, Date dataVencimento, boolean status) {
        this.idpagamento = idpagamento;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }

    public long getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(long idpagamento) {
        this.idpagamento = idpagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }
    
    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    public boolean getStatus() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.idpagamento ^ (this.idpagamento >>> 32));
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
        final Pagamento other = (Pagamento) obj;
        return this.idpagamento == other.idpagamento;
    }    
}
