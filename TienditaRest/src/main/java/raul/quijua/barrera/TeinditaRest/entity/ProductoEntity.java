 
package raul.quijua.barrera.TeinditaRest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.*;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
 @Entity(name="ProductoEntity")
 @Table( name="t_producto")
public class ProductoEntity implements Serializable{
     private static final long serialVersionUID = 1L;
     @Id
     @Column(name = "codpro")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name ="nompro")
    private String nombre;
    @Column(name ="preproc")
    private double preciocompra;
    @Column(name="preprov")
    private double preciventa;
    @Column (name="canpro")
    private double cantidad;
    @Column (name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name ="codcat",nullable=false)
    private CategoriaEntity categoria;
    
    
}
