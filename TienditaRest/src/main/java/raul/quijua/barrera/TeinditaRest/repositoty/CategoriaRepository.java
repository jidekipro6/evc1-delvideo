 
package raul.quijua.barrera.TeinditaRest.repositoty;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import raul.quijua.barrera.TeinditaRest.entity.CategoriaEntity;

 
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    @Query("select c from CategoriaEntity c where c.estado=true")
    List<CategoriaEntity>findAllCustom();
}
