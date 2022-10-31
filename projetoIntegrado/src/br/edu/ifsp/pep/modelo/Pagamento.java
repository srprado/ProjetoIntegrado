
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
    private Integer idpagamento;
    
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
    
    @JoinColumn(name = "cliente_cpf", referencedColumnName = "cpf")
    @ManyToOne(optional = false)
    private Cliente clienteCpf;

    public Pagamento() {
    }

    public Pagamento(Integer idpagamento) {
        this.idpagamento = idpagamento;
    }

    public Pagamento(Integer idpagamento, Date dataVencimento, boolean status) {
        this.idpagamento = idpagamento;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }

    public Integer getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(Integer idpagamento) {
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
        int hash = 0;
        hash += (idpagamento != null ? idpagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.idpagamento == null && other.idpagamento != null) || (this.idpagamento != null && !this.idpagamento.equals(other.idpagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.ifsp.pep.modelo.Pagamento[ idpagamento=" + idpagamento + " ]";
    }
    
}
