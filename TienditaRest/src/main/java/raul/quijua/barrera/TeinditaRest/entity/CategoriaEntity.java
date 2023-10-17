package raul.quijua.barrera.TeinditaRest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "CategoriaEntity")
@Table(name = "t_categoria")
public class CategoriaEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "codcat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nomcat")
    private String nombre;
    @Column(name = "estcat")
    private boolean estado;

}
