
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Receita;
import java.util.List;

public class ReceitaDAO extends AbstractDAO<Receita>{
    //buscar a receita geralda em tal consulta de um determinado cliente
    public List<Receita> findByAll() {
        return getEntityManager()
                .createNamedQuery("Receita.findAll", Receita.class)
                .getResultList();
    }
    
    
}
