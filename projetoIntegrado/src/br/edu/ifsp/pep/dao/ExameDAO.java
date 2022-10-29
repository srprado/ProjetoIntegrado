
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Exame;
import java.util.List;
import javax.persistence.TypedQuery;

public class ExameDAO extends AbstractDAO<Exame>{
    
    public Exame findByIdExame(long id){
        return getEntityManager().find(Exame.class, id);
    }
    
    public List<Exame> buscarTdsExames(){
        TypedQuery<Exame> query = getEntityManager()
                .createQuery("SELECT e FROM exame e",
                        Exame.class);
        
        return query.getResultList();
    }
    
}
