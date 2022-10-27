
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.math.BigDecimal;


public class Pricipal {
    
    public static void main(String[] args) {
        PlanoMedico solo = new PlanoMedico();
        solo.setTipoPlano("Solo");
        solo.setValor(new BigDecimal(15000));
        //Fazer o DAO das classes
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//        funcionarioDAO.inserir(f1);
    }
    
    
    
}
