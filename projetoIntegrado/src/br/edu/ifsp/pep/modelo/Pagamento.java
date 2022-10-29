
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
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pagamento")
public class Pagamento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpagamento")
    private long idPagamento;
    
    @Column(name = "data_vencimento", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;
    
    @Column(name = "data_pagamento", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPagamento;
    
    @Column(name = "valor_pago", precision = 6, scale = 2, nullable = true)
    private BigDecimal valorPago;
    
    @Column(name = "motivo_cancelamento", length = 45, nullable = true)
    private String motivoCancelamento;
    
    @Column(name = "status", nullable = false)
    private boolean status;
    
    @ManyToOne
    @JoinColumn(name = "cliente_cpf")
    private Cliente clienteCpf;

    public Pagamento() {
    }

    public long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(long idPagamento) {
        this.idPagamento = idPagamento;
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

}
