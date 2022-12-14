
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
import javax.persistence.JoinColumns;
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
    @NamedQuery(name = "Pagamento.findByIdpagamento", query = "SELECT p FROM Pagamento p WHERE p.idpagamento = :idpagamento"),
    @NamedQuery(name = "Pagamento.findByDataVencimento", query = "SELECT p FROM Pagamento p WHERE p.dataVencimento = :dataVencimento"),
    @NamedQuery(name = "Pagamento.findByDataPagamento", query = "SELECT p FROM Pagamento p WHERE p.dataPagamento = :dataPagamento"),
    @NamedQuery(name = "Pagamento.findByStatus", query = "SELECT p FROM Pagamento p WHERE p.status = :status"),
})
public class Pagamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpagamento")
    private Integer idpagamento;

    @Column(name = "valor_pago", precision = 8, scale = 2, nullable = false)
    private BigDecimal valorPago;
    
    @Column(name = "data_vencimento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    @Column(name = "data_pagamento")
    
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "motivo_cancelamento", length = 150, nullable = false)
    private String motivoCancelamento;
    
    @JoinColumns({
        @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf", nullable = false)})
    @ManyToOne(optional = false)
    private Cliente clienteCpf;

    public Pagamento() {
    }

    public Pagamento(Integer idpagamento) {
        this.idpagamento = idpagamento;
    }

    public Pagamento(Integer idpagamento, BigDecimal valorPago, boolean status, String motivoCancelamento) {
        this.idpagamento = idpagamento;
        this.valorPago = valorPago;
        this.status = status;
        this.motivoCancelamento = motivoCancelamento;
    }

    public Integer getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(Integer idpagamento) {
        this.idpagamento = idpagamento;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    public Cliente getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(Cliente clienteCpf) {
        this.clienteCpf = clienteCpf;
    }  
}
