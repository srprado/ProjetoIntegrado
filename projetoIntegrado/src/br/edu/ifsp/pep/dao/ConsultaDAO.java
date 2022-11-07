
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Consulta;
import java.util.List;
import javax.persistence.TypedQuery;

public class ConsultaDAO extends AbstractDAO<Consulta>{
    
    public Consulta findByIdConsulta(long id){
        return getEntityManager().find(Consulta.class, id);
    }
    
    public List<Consulta> findByAll() {
        return getEntityManager()
                .createNamedQuery("Consulta.findAll", Consulta.class)
                .getResultList();
    }
    
}
