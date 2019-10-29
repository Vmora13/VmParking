
package co.edu.uan.parking.dominio;

//@author VivianaM

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Parking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPuesto;
    private String puesto;
   
    
    @OneToOne(optional=false) 
    @JoinColumn(name="placa", nullable=false)
    private Vehiculo vehiculo;
    
    protected Parking(){
        
    }
    
    private Parking (Vehiculo vehiculo, String puesto){
        this.vehiculo = vehiculo;
        this.puesto = this.puesto;
    
    }
    
    @Override
    public String toString (){
        return String.format("Producto(idProducto: %d, pedido: %s, puesto: %s",
                idPuesto, vehiculo.getPlaca(), puesto );
    }    

    public Long getIdProducto() {
        return idPuesto;
    }

    public void setIdProducto(Long idProducto) {
        this.idPuesto = idProducto;
    }


    
}
