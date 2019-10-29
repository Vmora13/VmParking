
package co.edu.uan.parking.dominio;

//@author  VivianaM

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Vehiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long placa;
    private String fecha;
    private String color; 
    private String tipo;
    
    @ManyToOne(optional=false) //relacion muchos a uno
    @JoinColumn(name="Vehiculo_id", nullable=false) 
    private Cliente cliente;
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="vehiculo")
    private Parking productos = new Parking ();
    
    protected Vehiculo (){
    }

    public Vehiculo(Cliente cliente, String fecha, String tipo) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.tipo = tipo;
    }
    
    @Override
    public String toString (){
        return String.format("Pedido (placa: %d, cliente: %s , fecha: %s, color: %d, tipo: %s",
                placa, cliente.getIdentificacion() ,fecha, color, tipo);
    }
    
    
    public Long getPlaca() {
        return placa;
    }

    public void setPlaca(Long idPedido) {
        this.placa = idPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

        
}
