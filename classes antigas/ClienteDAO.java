
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Cliente;
import java.util.List;
import javax.persistence.TypedQuery;

public class ClienteDAO extends AbstractDAO<Cliente>{
    
    public Cliente findByCpfCliente(String cpf){
        return getEntityManager().find(Cliente.class, cpf);
    }
    
    public List<Cliente> buscarTdsClientes(){
        TypedQuery<Cliente> query = getEntityManager()
                .createQuery("SELECT c FROM cliente c",
                        Cliente.class);
        
        return query.getResultList();
    }
    
}
