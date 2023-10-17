package raul.quijua.barrera.TeinditaRest.service;

import java.util.List;
import java.util.Optional;
import raul.quijua.barrera.TeinditaRest.entity.ProductoEntity;

public interface ProductoService {

    List<ProductoEntity> findAll();

    List<ProductoEntity> findAllCustom();

    Optional<ProductoEntity> findById(long id);

    ProductoEntity add(ProductoEntity p);

    ProductoEntity update(ProductoEntity p);

    ProductoEntity delete(ProductoEntity p);

}
