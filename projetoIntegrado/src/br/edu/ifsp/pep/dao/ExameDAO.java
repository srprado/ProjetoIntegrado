
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Exame;
import java.util.List;
import javax.persistence.TypedQuery;

public class ExameDAO extends AbstractDAO<Exame>{
  
    public List<Exame> findAll() {
        return getEntityManager()
                .createNamedQuery("Exame.findAll", Exame.class)
                .getResultList();
    }

}
