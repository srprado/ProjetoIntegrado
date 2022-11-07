
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Secretariado;
import java.util.List;
import javax.persistence.TypedQuery;

public class SecretariadoDAO extends AbstractDAO<Secretariado>{
    
    public Secretariado findByCpfSecretario(String cpf){
        return getEntityManager().find(Secretariado.class, cpf);
    }
    
    public List<Secretariado> findByAll() {
        return getEntityManager()
                .createNamedQuery("Secretariado.findAll", Secretariado.class)
                .getResultList();
    }
}
