
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Medico;
import java.util.List;
import javax.persistence.TypedQuery;

public class MedicoDAO extends AbstractDAO<Medico>{
    
    public Medico findByCpfMedico(String cpf){
        return getEntityManager().find(Medico.class, cpf);
    }
    
    public List<Medico> findByAll() {
        return getEntityManager()
                .createNamedQuery("Medico.findAll", Medico.class)
                .getResultList();
    }
    
}
