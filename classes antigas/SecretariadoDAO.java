
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Secretariado;
import java.util.List;
import javax.persistence.TypedQuery;

public class SecretariadoDAO extends AbstractDAO<Secretariado>{
    
    public Secretariado findByCpfSecretario(String cpf){
        return getEntityManager().find(Secretariado.class, cpf);
    }
    
    public List<Secretariado> buscarTdsSecretarios(){
        TypedQuery<Secretariado> query = getEntityManager()
                .createQuery("SELECT s FROM secretariado s",
                        Secretariado.class);
        
        return query.getResultList();
    }
    
}
