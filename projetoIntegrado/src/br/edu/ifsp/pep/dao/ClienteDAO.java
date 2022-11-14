
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class ClienteDAO extends AbstractDAO<Cliente>{
    
    public Cliente findByCpfCliente(String cpf){        
        return getEntityManager()
                .createNamedQuery("Cliente.findByCpf",Cliente.class)
                .setParameter("cpf", cpf)
                .getSingleResult();        
    }
    
    public List<Cliente> findByAll() {
        return getEntityManager()
                .createNamedQuery("Cliente.findAll", Cliente.class)
                .getResultList();
    }
    
     public List<Cliente> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Cliente.findByNome", Cliente.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    @Override
    public void inserir(Cliente cliente) throws Exception{
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        List<Cliente> clientes = em.createNamedQuery("Cliente.findByCpf", Cliente.class)
                .setParameter("cpf", cliente.getCpf())
                .getResultList();
    if(clientes == null || clientes.isEmpty()){
        em.persist(cliente);
    } 
    else{
        throw new Exception(
                "Esse cliente já está cadastrado"
                + cliente.getCpf()
        );
    }
    
    em.getTransaction().commit();
    em.close();   
    }
    
    
    
}
