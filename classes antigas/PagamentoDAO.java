/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pagamento;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author sabri
 */
public class PagamentoDAO extends AbstractDAO<Pagamento>{
    
    public Pagamento findByIdPagamento(long id){
        return getEntityManager().find(Pagamento.class, id);
    }
    
    public List<Pagamento> buscarTdsSPagamentos(){
        TypedQuery<Pagamento> query = getEntityManager()
                .createQuery("SELECT pa FROM pagamento pa",
                        Pagamento.class);
        
        return query.getResultList();
    }
    
}
