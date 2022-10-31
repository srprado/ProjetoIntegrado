
import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.MedicoDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.dao.SecretariadoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Principal {
    
    private static PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();
    private static MedicoDAO medicoDAO = new MedicoDAO();
    private static SecretariadoDAO secretariadoDao = new SecretariadoDAO();
    private static ClienteDAO clienteDAO = new ClienteDAO();
    
    public static void main(String[] args){        
   
        inserirPlano(); 
        inserirCliente();
    }
    
    private static void inserirPlano(){
        PlanoMedico solo = new PlanoMedico();
        solo.setTipo("Solo");
        solo.setValorMensal(new BigDecimal(150));        
        
        try {
            planoDAO.inserir(solo);
        } catch (Exception ex) {
            System.out.println("Erro ao inserir plano!");
        }    
    }
    
    private static void inserirCliente(){
        Cliente cliente = new Cliente();
        cliente.setCpf("123.456.789-00");
        cliente.setNome("Sabrina Ramos Prado");
        Date dtNascimento = new Date(2000,12,13);
        cliente.setDataNascimento(dtNascimento);
        cliente.setTelefone("(18)98199-9999");
        cliente.setEmail("sabrinaprado@gmail.com");
        cliente.setEndereco("Rua das flores");
        cliente.setStatus(true);       
       
        try {
            clienteDAO.inserir(cliente);
        } catch (Exception ex) {
            System.out.println("Erro ao inserir cliente!");
        }    
    }
    
    
    
        
        
        
        //Fazer o DAO das classes
//        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
//        funcionarioDAO.inserir(f1);
    
    
    
    
}
