
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.math.BigDecimal;

public class Principal {
    private static PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();
    private static PlanoMedico plano = new PlanoMedico();
  
    public static void main(String[] args) {
        plano.setNome("Solo");
        plano.setValorMensal(new BigDecimal(150));
        planoDAO.inserir(plano);
        
    }
    
}
