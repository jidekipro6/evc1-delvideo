 
package raul.quijua.barrera.TeinditaRest.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raul.quijua.barrera.TeinditaRest.entity.CategoriaEntity;
import raul.quijua.barrera.TeinditaRest.repositoty.CategoriaRepository;
import raul.quijua.barrera.TeinditaRest.service.CategoriaService;

 @Service
public class CategoriaServiceImpl implements CategoriaService{
     @Autowired
     private CategoriaRepository repositorio;

    @Override
    public List<CategoriaEntity> findAll() {
        return repositorio.findAll();
     }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return repositorio.findAllCustom();
     }

    @Override
    public Optional<CategoriaEntity> findById(long id) {
        return repositorio.findById(id);
     }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return repositorio.save(c);
     }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcategoria=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcategoria);
        return repositorio.save(objcategoria);
     }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcategoria=repositorio.getById(c.getCodigo());
        objcategoria.setEstado(false);
        return repositorio.save(objcategoria);
         
     }
    
}
