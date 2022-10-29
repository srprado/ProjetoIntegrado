
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Consulta;
import java.util.List;
import javax.persistence.TypedQuery;

public class ConsultaDAO extends AbstractDAO<Consulta>{
    
    public Consulta findByIdConsulta(long id){
        return getEntityManager().find(Consulta.class, id);
    }
    
    public List<Consulta> buscarTdsConsultas(){
        TypedQuery<Consulta> query = getEntityManager()
                .createQuery("SELECT co FROM consulta co",
                        Consulta.class);
        
        return query.getResultList();
    }
    
}
