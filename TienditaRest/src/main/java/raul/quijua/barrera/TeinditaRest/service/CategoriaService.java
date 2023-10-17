package raul.quijua.barrera.TeinditaRest.service;

import java.util.List;
import java.util.Optional;
import raul.quijua.barrera.TeinditaRest.entity.CategoriaEntity;

public interface CategoriaService {

    List<CategoriaEntity> findAll();

    List<CategoriaEntity> findAllCustom();

    Optional<CategoriaEntity> findById(long id);

    CategoriaEntity add(CategoriaEntity c);

    CategoriaEntity update(CategoriaEntity c);

    CategoriaEntity delete(CategoriaEntity c);

}
