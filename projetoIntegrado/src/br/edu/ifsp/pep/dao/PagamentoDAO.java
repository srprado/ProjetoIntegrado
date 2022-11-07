
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Pagamento;
import java.util.List;
import javax.persistence.TypedQuery;

public class PagamentoDAO extends AbstractDAO<Pagamento>{
     //buscar todos os pagamentos de um cliente   
    public List<Pagamento> findByAll() {
        return getEntityManager()
                .createNamedQuery("Pagamento.findAll", Pagamento.class)
                .getResultList();
    }
    
}
