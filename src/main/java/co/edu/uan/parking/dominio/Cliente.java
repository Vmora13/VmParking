
package co.edu.uan.parking.dominio;

//@author VivianaM

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identificacion;
    private String nomCliente;
    private String apeCliente;
    private String ciudadCliente;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="cliente") 
    private List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
    
    protected Cliente (){
    }
    
    //Constructor para crear instancias de Cliente para guardar en la base de datos.
    public Cliente(String nomCliente, String apeCliente) {    
        this.nomCliente = nomCliente;
        this.apeCliente = apeCliente;
        
    }
    
    public Cliente(String nomCliente) {
        this.nomCliente = nomCliente;

    }

    @Override
    //Método para imprimir las propiedades del cliente.
    public String toString() {
        return String.format("Cliente(identificacion: %d, nomCliente: %s, apeCliente: %s, ciudadCliente: %s, vehiculo: %s",
                identificacion, nomCliente, apeCliente,  ciudadCliente, vehiculo);
    }
    
    

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApeCliente() {
        return apeCliente;
    }

    public void setApeCliente(String apeCliente) {
        this.apeCliente = apeCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculo;
    }

    public void setVehiculos(List<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    /*
    
    }
    */

    public void setIdentificacion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
