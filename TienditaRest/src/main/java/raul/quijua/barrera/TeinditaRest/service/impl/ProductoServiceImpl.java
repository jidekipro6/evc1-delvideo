package raul.quijua.barrera.TeinditaRest.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raul.quijua.barrera.TeinditaRest.entity.ProductoEntity;
import raul.quijua.barrera.TeinditaRest.repositoty.ProductoRepository;
import raul.quijua.barrera.TeinditaRest.service.ProductoService;
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(long id) {
        return repositorio.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity c) {
        return repositorio.save(c);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objproducto = repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objproducto = repositorio.getById(p.getCodigo());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);

    }

}
