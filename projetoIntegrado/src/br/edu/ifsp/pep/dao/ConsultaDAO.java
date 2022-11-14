
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Consulta;
import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;

public class ConsultaDAO extends AbstractDAO<Consulta>{
    
    public Consulta findByIdConsulta(long id){
        return getEntityManager().find(Consulta.class, id);
    }
    
    public List<Consulta> findByAll() {
        return getEntityManager()
                .createNamedQuery("Consulta.findAll", Consulta.class)
                .getResultList();
    }
    
    public List<Consulta> findByAllTrue(boolean status) {
        return getEntityManager()
                .createNamedQuery("Consulta.findByStatus", Consulta.class)
                .setParameter("status", status)
                .getResultList();
    }
    
    public List<Consulta> findByDay(Date dia){
        return getEntityManager()
                .createNamedQuery("Consulta.findByDia",Consulta.class)
                .setParameter("data", dia)
                .getResultList();  
    }
    
    public List<Consulta> findByDayandTime(Date dia, Date hora){
        return getEntityManager()
                .createNamedQuery("Consulta.findByDiaeHora", Consulta.class)
                .setParameter("data", dia)
                .setParameter("horario", hora)
                .getResultList();
    }
    
    public List<Consulta> findByNomeCliente(String nome){
        return getEntityManager()
                .createNamedQuery("Consulta.findbyCliente", Consulta.class)
                .setParameter("clienteCpf", "%" + nome + "%")
                .getResultList();    
    }
    
}
