
package br.edu.ifsp.pep.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO<T> {
    
    private EntityManagerFactory emf;
    
    public AbstractDAO(){
        emf = Persistence.createEntityManagerFactory("projetoIntegradoPU");
    }
    
    protected EntityManager getEntityManager() {
        return this.emf.createEntityManager();
    }
    
    public void inserir(T entidade) {
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.persist(entidade);
        em.getTransaction().commit();

        em.close();
    }
    
    public void alterar(T entidade) {
        EntityManager em = getEntityManager();

        em.getTransaction().begin();
        em.merge(entidade);
        em.getTransaction().commit();

        em.close();
    }
    
    public void remover(T entidade){
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.remove(em.merge(entidade));
        em.getTransaction().commit();

        em.close();
    }
    
}
