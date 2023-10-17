 
package raul.quijua.barrera.TeinditaRest.repositoty;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import raul.quijua.barrera.TeinditaRest.entity.ProductoEntity;

 
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    @Query("select p from ProductoEntity p where p.estado=true")
    List<ProductoEntity> findAllCustom();
}
