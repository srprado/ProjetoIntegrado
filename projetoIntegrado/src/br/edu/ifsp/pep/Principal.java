
package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.ConsultaDAO;
import br.edu.ifsp.pep.dao.PlanoMedicoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Consulta;
import br.edu.ifsp.pep.modelo.PlanoMedico;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Principal {
    private static PlanoMedicoDAO planoDAO = new PlanoMedicoDAO();
    private static PlanoMedico plano = new PlanoMedico();
    private static Consulta consulta = new Consulta();
    private static ConsultaDAO consultaDAO = new ConsultaDAO();
    List<Cliente> clientes;
  
    public static void main(String[] args) throws ParseException {
        plano.setNome("Solo");
        plano.setValorMensal(new BigDecimal(150));
        planoDAO.inserir(plano);
        
//        Date data = null;
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        data = formato.parse("20-11-2022");
//        
//        Date hora = null;
//        SimpleDateFormat form = new SimpleDateFormat("00:00");
//        hora = formato.parse("09:00");
//        consulta.setData(data);
//        consulta.setHorario(hora);
//        consulta.setStatus(true);        
//        consulta.setClienteCpf(clientes.get(0).getCpf());
//        consulta.setMedicoCpf("123.456.789-00");

//        Date data = null;
//        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            data = formato.parse(dataInicio);
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        promocao.setData_inicio(formato.format(data));
        

        
        
    }
    
}
