
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class PlanoMedicoDAO extends AbstractDAO<PlanoMedico>{
    
    public PlanoMedico findByidPlano(long id){
        return getEntityManager().find(PlanoMedico.class, id);
    }
    
    public List<PlanoMedico> buscarTdsPlanos(){
        TypedQuery<PlanoMedico> query = getEntityManager()
                .createQuery("SELECT pl FROM plano_medico pl",
                        PlanoMedico.class);
        
        return query.getResultList();
    }
    
    
}
