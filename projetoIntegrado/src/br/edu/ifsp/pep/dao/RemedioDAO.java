
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Remedio;
import java.util.List;
import javax.persistence.TypedQuery;

public class RemedioDAO extends AbstractDAO<Remedio>{
    
     public Remedio findByIdRemedio(long id){
        return getEntityManager().find(Remedio.class, id);
    }
    
    public List<Remedio> buscarTdsRemedios(){
        TypedQuery<Remedio> query = getEntityManager()
                .createQuery("SELECT r FROM remedio r",
                        Remedio.class);
        
        return query.getResultList();
    }
    
}
