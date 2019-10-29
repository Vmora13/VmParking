
package co.edu.uan.parking.repositorio;

// @author VivianaM

import co.edu.uan.parking.dominio.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepositorio extends CrudRepository <Cliente, Long> {
    
    List<Cliente> findBynomCliente (String nomCliente);
    List<Cliente> findByciudadCliente (String ciudadCliente);

}

