
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Cliente;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends AbstractDAO<Cliente>{
    
    public Cliente findByCpfCliente(String cpf){
        return getEntityManager().find(Cliente.class, cpf);
    }
    
    public List<Cliente> findByAll() {
        return getEntityManager()
                .createNamedQuery("Cliente.findAll", Cliente.class)
                .getResultList();
    }
    
}
