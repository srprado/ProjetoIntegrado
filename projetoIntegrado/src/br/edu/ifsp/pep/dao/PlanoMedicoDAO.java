
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.util.List;
import javax.persistence.TypedQuery;

public class PlanoMedicoDAO extends AbstractDAO<PlanoMedico>{
    
    public PlanoMedico findByIdPlano(long id){
        return getEntityManager().find(PlanoMedico.class, id);
    }
    
    public List<PlanoMedico> findByAll() {
        return getEntityManager()
                .createNamedQuery("PlanoMedico.findAll", PlanoMedico.class)
                .getResultList();
    }
    
    
}
