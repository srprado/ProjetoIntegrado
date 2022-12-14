
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
    
    public List<Medico> findByNome(String nome) {
        return getEntityManager()
                .createNamedQuery("Medico.findByNome", Medico.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
    public Medico buscaLogin(String login){
        return getEntityManager()
                .createNamedQuery("Medico.findByLoginNome", Medico.class)
                .setParameter("loginNome", login)
                .getSingleResult();    
    }
    
    public Medico buscaSenha(String senha){
        return getEntityManager()
                .createNamedQuery("Medico.findByLoginSenha", Medico.class)
                .setParameter("loginSenha", senha)
                .getSingleResult();    
    }
    
}
