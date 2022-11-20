
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Consulta;
import br.edu.ifsp.pep.modelo.Medico;
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
    
    public List<Consulta> findByDayandMedico(Date dia, Medico identificadorMedico){
        return getEntityManager()
                .createNamedQuery("Consulta.findByDiaeMedico",Consulta.class)
                .setParameter("data", dia)
                .setParameter("medicoCpf", identificadorMedico)
                .getResultList();  
    }
    
    public List<Consulta> findByDayandTime(Date dia, Date hora){
        return getEntityManager()
                .createNamedQuery("Consulta.findByDiaeHora", Consulta.class)
                .setParameter("data", dia)
                .setParameter("horario", hora)
                .getResultList();
    }
    
    public List<Consulta> findByDayTimeandMedico(Date dia, Medico identificadorMedico, Date hora){
        return getEntityManager()
                .createNamedQuery("Consulta.findByDiaHoraeMedico",Consulta.class)
                .setParameter("data", dia)
                .setParameter("medicoCpf", identificadorMedico)
                .setParameter("horario", hora)
                .getResultList();  
    }    
        
    public List<Consulta> findByCPFMedico(Medico identificadorMedico){
        return getEntityManager()
                .createNamedQuery("Consulta.findbyMedico", Consulta.class)
                .setParameter("medicoCpf", identificadorMedico)
                .getResultList();    
    }
    
    public List<Consulta> findByCPFCliente(Cliente identificadorCliente){
        return getEntityManager()
                .createNamedQuery("Consulta.findbyCliente", Consulta.class)
                .setParameter("clienteCpf", identificadorCliente)
                .getResultList();    
    }
    
    public List<Consulta> findByCPFClienteandMedico(Cliente identificadorCliente,Medico identificadorMedico){
        return getEntityManager()
                .createNamedQuery("Consulta.findbyClienteMedico", Consulta.class)
                .setParameter("clienteCpf", identificadorCliente)
                .setParameter("medicoCpf",identificadorMedico )
                .getResultList();    
    }
    
    
}
