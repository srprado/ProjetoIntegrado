
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
    
    public List<Secretariado> findByNome(String nome){
        return getEntityManager()
                .createNamedQuery("Secretariado.findByNome", Secretariado.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public Secretariado buscaLogin(String login){
        return getEntityManager()
                .createNamedQuery("Secretariado.findByLoginNome", Secretariado.class)
                .setParameter("loginNome", login)
                .getSingleResult();    
    }
    
    public Secretariado buscaSenha(String senha){
        return getEntityManager()
                .createNamedQuery("Secretariado.findByLoginSenha", Secretariado.class)
                .setParameter("loginSenha", senha)
                .getSingleResult();    
    }
}
